package com.test2.domain;

public class User2 {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public User2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public User2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "User2 [id=" + id + ", name=" + name + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
