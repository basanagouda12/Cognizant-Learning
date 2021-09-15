package com.basu.mockito.api;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements ToDoService{

	public List<String> retrieveTodos(String user) {
		// TODO Auto-generated method stub
		
		return Arrays.asList("Learn Spring MVC", "Learn Spring",
				"Learn to Dance");
	}

	public void deleteTodo(String todo) {
		// TODO Auto-generated method stub
		
	}
	
}
