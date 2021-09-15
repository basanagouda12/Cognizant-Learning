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

import org.junit.Test;
import org.mockito.ArgumentCaptor;

import com.basu.mockito.api.ToDoService;

public class TodoBusenessImplMockTest {

	@Test
	public void testRetreaveTodoRelatedToSpring_usingMock() {

		ToDoService todoServiceMock = mock(ToDoService.class);
		List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
		when(todoServiceMock.retrieveTodos("dummy")).thenReturn(todos);

		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);

		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("dummy");

		assertEquals(2, filteredTodos.size());
	}

	@Test
	public void testRetreaveTodoRelatedToSpring_usingBDD() {
		// Given
		ToDoService todoServiceMock = mock(ToDoService.class);
		List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
		given(todoServiceMock.retrieveTodos("dummy")).willReturn(todos);

		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);

		// when
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("dummy");

		// then

		assertThat(filteredTodos.size(), is(2));

	}

	@Test
	public void testDeleteTodoNotRelatedToSpring_usingBDD() {
		// Given
		ToDoService todoServiceMock = mock(ToDoService.class);
		List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
		given(todoServiceMock.retrieveTodos("dummy")).willReturn(todos);

		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);

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
		ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);
		//Define Argument captor on specific method call
		//Capture the argument
		
		// Given
		ToDoService todoServiceMock = mock(ToDoService.class);
		List<String> todos = Arrays.asList("Learn to rock and roll", "Learn Spring", "Learn to Dance");
		given(todoServiceMock.retrieveTodos("dummy")).willReturn(todos);

		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);

		// when
		todoBusinessImpl.deleteTodosNotRelatedToSpring("dummy");

		// then
//		verify(todoServiceMock, times(1)).deleteTodo("Learn to Dance");
//
//		verify(todoServiceMock, never()).deleteTodo("Learn Spring MVC");
//
//		verify(todoServiceMock, never()).deleteTodo("Learn Spring");
		
		then(todoServiceMock).should(times(0)).deleteTodo(argumentCaptor.capture());
		assertThat(argumentCaptor.getAllValues().size(), is(2));
	}

}
