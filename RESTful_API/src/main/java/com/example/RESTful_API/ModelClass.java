package com.example.RESTful_API;

public class ModelClass {

	private String id;
	private String name;
	private String age;

	public ModelClass() {

	}

	public ModelClass(String id, String name, String age) {

		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
