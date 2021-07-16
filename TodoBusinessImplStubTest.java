package com.example.buisness;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.example.data.api.TodoService;
import com.example.data.api.TodoServiceStub;

public class TodoBusinessImplStubTest {

	@Test
	public void test() {
		TodoService todoService = new TodoServiceStub();
		TodoBuisnessImpl todoBuisnessImpl = new TodoBuisnessImpl(todoService);
		List<String> todos = todoBuisnessImpl
				.retrieveTodosRelatedToSpring("Ranga");
		assertEquals(2, todos.size());
	}

}
