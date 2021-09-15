package com.basu.mockito.api;

import java.util.List;

public interface ToDoService {
	public List<String> retrieveTodos(String user);
	public void deleteTodo(String todo);
	}
