package com.BasicClass;

public class BasicClass implements Cloneable {

	String name;
	String breed;
	int age;
	String color;
	
	public BasicClass(String name, String breed, int age, String color) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}
	
	public BasicClass() {
		this.name = "Husky";
		this.breed = "Husky";
		this.age = 12;
		this.color = "White";
	}
	
	@Override
	public String toString() {
		return ("Hi my name is " + this.name + " and " + "my breed is " + this.breed + ".");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicClass bc = new BasicClass("German_Shephard", "Alsessian", 45, "Brown");
		System.out.println(bc.toString());
		
		
		try {
			Class cls = Class.forName("com.BasicClass.BasicClass");
			BasicClass bc1 = (BasicClass) cls.newInstance();
			System.out.println(bc1.toString());
		}
		
		catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		
		catch(InstantiationException ex) {
			ex.printStackTrace();
		}
		
		catch(IllegalAccessException ex) {
			ex.printStackTrace();
		}
		
		
		try {
			BasicClass cloned = (BasicClass) bc.clone();
			System.out.println(cloned.toString());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
