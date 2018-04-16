package com.InitializerBlock;

public class InitializerBlock {
	
	String name;
	
	{
		System.out.println("Initializer Block is called");
	}
	
	public InitializerBlock() {
		name = "BILAL";
		System.out.println("Default constructor called");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InitializerBlock ib = new InitializerBlock();
	}

}
