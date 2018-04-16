package com.Labels;

public class labels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	outer:
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(j==1)
					break outer;
				System.out.println("value of j = " + j);
			}
		}
	
	outer:
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(j==1)
					continue outer;
				System.out.println("value of j = " + j);
			}
		}
	}

}
