package com.spring.SpringDemo;

public class Alien {
	private int age;
	private Laptop laptop;
	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

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
		laptop.compile();
	}
}
