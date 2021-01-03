package com.codingwithmitch.todolist.util;

import com.codingwithmitch.todolist.models.Task;

import java.util.ArrayList;
import java.util.List;


public class DataSource {

	public static List<Task> createTasksList() {
		List<Task> tasks = new ArrayList<>();
		tasks.add(new Task("1.Take out the trash", true, 3));
		tasks.add(new Task("2.Walk the dog", false, 2));
		tasks.add(new Task("3.Make my bed", true, 1));
		tasks.add(new Task("4.Unload the dishwasher", false, 0));
		tasks.add(new Task("5.Make dinner", true, 5));
		return tasks;
	}
}














