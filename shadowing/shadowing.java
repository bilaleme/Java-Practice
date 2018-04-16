package com.shadowing;

public class shadowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new B();
		A.fun();
	}

}

class A { 
	public static void fun() {
		System.out.println("printing fun A");
	}
}

class B extends A{
	public static void fun() {
		System.out.println("printing fun B");
	}
}
