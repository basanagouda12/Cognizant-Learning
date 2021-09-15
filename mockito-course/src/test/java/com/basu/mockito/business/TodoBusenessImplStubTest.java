package com.basu.mockito.business;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.basu.mockito.api.ToDoService;
import com.basu.mockito.api.TodoServiceStub;

public class TodoBusenessImplStubTest {

	@Test
	public void testRetreaveTodoRelatedToSpring_usingStub() {
		ToDoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);

		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("dummy");
		
		assertEquals(2, filteredTodos.size());
	}
	
	

}
