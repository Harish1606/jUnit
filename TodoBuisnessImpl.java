package com.example.buisness;

import java.util.ArrayList;
import java.util.List;

import com.example.data.api.TodoService;

public class TodoBuisnessImpl {
	
	private TodoService todoService;

	public TodoBuisnessImpl(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	public List<String> retrieveTodosRelatedToSpring(String user) {
		List<String> filteredTodos = new ArrayList<String>();
		List<String> allTodos = todoService.retrieveTodos(user);
		for (String todo : allTodos) {
			if (todo.contains("Spring")) {
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}
}
