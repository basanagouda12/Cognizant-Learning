package com.basu.mockito.business;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.runners.MockitoJUnitRunner;

import com.basu.mockito.api.ToDoService;

public class TodoBusenessImplMockitoInjectMock {
	
	@Rule
	public MockitoRule mockitoRule = MockitoJUnit.rule();
	
	@Mock
	ToDoService todoServiceMock;
	
	@InjectMocks
	TodoBusinessImpl todoBusinessImpl;
	
	@Captor
	ArgumentCaptor<String> argumentCaptor;
	
	@Test
	public void testRetreaveTodoRelatedToSpring_usingMock() {

		List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
		when(todoServiceMock.retrieveTodos("dummy")).thenReturn(todos);


		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("dummy");

		assertEquals(2, filteredTodos.size());
	}

	@Test
	public void testRetreaveTodoRelatedToSpring_usingBDD() {
		// Given
		List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
		given(todoServiceMock.retrieveTodos("dummy")).willReturn(todos);


		// when
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("dummy");

		// then

		assertThat(filteredTodos.size(), is(2));

	}

	@Test
	public void testDeleteTodoNotRelatedToSpring_usingBDD() {
		// Given
		List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
		given(todoServiceMock.retrieveTodos("dummy")).willReturn(todos);


		// when
		todoBusinessImpl.deleteTodosNotRelatedToSpring("dummy");

		// then
		verify(todoServiceMock, times(1)).deleteTodo("Learn to Dance");

		verify(todoServiceMock, never()).deleteTodo("Learn Spring MVC");

		verify(todoServiceMock, never()).deleteTodo("Learn Spring");

	}
	
	
	@Test
	public void testDeleteTodoNotRelatedToSpring_usingBDD_argumentCapture() {
		
		//Declare argument Captor
		//Define Argument captor on specific method call
		//Capture the argument
		
		// Given
		List<String> todos = Arrays.asList("Learn to rock and roll", "Learn Spring", "Learn to Dance");
		given(todoServiceMock.retrieveTodos("dummy")).willReturn(todos);


		// when
		todoBusinessImpl.deleteTodosNotRelatedToSpring("dummy");

		// then
//		verify(todoServiceMock, times(1)).deleteTodo("Learn to Dance");
//
//		verify(todoServiceMock, never()).deleteTodo("Learn Spring MVC");
//
//		verify(todoServiceMock, never()).deleteTodo("Learn Spring");
		
		then(todoServiceMock).should(times(2)).deleteTodo(argumentCaptor.capture());
		assertThat(argumentCaptor.getAllValues().size(), is(2));
	}

}
