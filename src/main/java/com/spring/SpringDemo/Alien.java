package com.spring.SpringDemo;


import org.springframework.stereotype.Component;

@Component
public class Alien {
	private int age;
	
	public Alien() {
		System.out.println("In alien Constructor");
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public void code()
	{
		System.out.println("In coding");
	}
}
