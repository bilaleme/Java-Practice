package com.foreach;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] marks = {22,33,44,55,66};
		int highest_marks = maximum(marks);
		
		System.out.println("The highest score is " + highest_marks);
	}

	private static int maximum(int[] marks) {
		// TODO Auto-generated method stub
		int max = marks[0];
		
		for(int num : marks){
			if(num > max) {
				max = num;
			}
		}
		
		return max;
	}

}
