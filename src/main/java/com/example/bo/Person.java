package com.example.bo;

import java.util.List;

public class Person {

	private List lists;

	public List getLists() {
		return lists;
	}

	public void setLists(List lists) {
		this.lists = lists;
	}

	@Override
	public String toString() {
		return "Person [lists=" + lists + "]";
	}
	
}
