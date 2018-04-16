package com.Enums;

import java.util.Scanner;

enum Day{
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class main {

	Day day;
	
	public main(Day day) {
		this.day = day;
	}
	
	public void dayIsLike() {
		switch(day) {
		case MONDAY:
			System.out.println("Mondays are bad");
			break;
		case TUESDAY:
			System.out.println("Tuesdays are mild");
			break;
		case SATURDAY:
			System.out.println("Saturday is best");
			break;
		default:
            System.out.println("Midweek days are so-so.");
            break;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "MONDAY";
		Day day = Day.valueOf(str);
		System.out.println(day.toString());
		
		main mn = new main(day);
		
		mn.dayIsLike();
		
		
	}

}
