package com.instanceofclass;


class Child{
	String name;
	
	public Child(String name) {
		this.name = name;
	}
}

public class instanceoff {
	public static void main(String[] args) {
		Child obj = new Child("Bilal");
		
		if(obj instanceof Child)
			System.out.println("True");
	}
}
