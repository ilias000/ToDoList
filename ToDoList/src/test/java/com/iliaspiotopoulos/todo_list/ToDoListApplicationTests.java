package com.iliaspiotopoulos.todo_list;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
class ToDoListApplicationTests {

	@Test
	void contextLoads()
	{
		assertDoesNotThrow(() -> ToDoListApplication.main(new String[]{}));
	}

}
