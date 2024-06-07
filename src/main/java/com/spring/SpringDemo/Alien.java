package com.spring.SpringDemo;

public class Alien {
	private int age;
	//private Laptop laptop;
	private Computor com;
	
	public Alien(int age) {
		super();
		this.age = age;
	}
	

//	public Alien() {
//		System.out.println("In alien Constructor");
//	}
	
	public int getAge() {
		return age;
	}
	public Computor getCom() {
		return com;
	}


	public void setCom(Computor com) {
		this.com = com;
	}


	public void setAge(int age) {
		this.age = age;
	}

	public void code()
	{
		System.out.println("In coding");
		com.compile();
	}


}
