package com.covariants;

class A{
	
}

class B extends A{
	
}

class Base{
	A fun() {
		System.out.println("Outputing A");
		return new A();
	}
}

class Derived extends Base{
	B fun() {
		System.out.println("Outputing B");
		return new B();
	}
}

public class covariants {
	public static void main(String[] args) {
		Derived obj = new Derived();
		obj.fun();
	}
}
