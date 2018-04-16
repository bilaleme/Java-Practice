package com.inheritance;

public class Bicycle {

	public int gear;
	public int speed;
	
	public Bicycle(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	
	public void applyBrake(int decrement) {
		speed -= decrement;
	}
	
	public void speedUp(int increment) {
		speed += speed;
	}
	
	@Override
	public String toString() {
		return ("No of gears are " + gear + "\n" + "Speed of bicycle is " + speed);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MountainBike mb = new MountainBike(4, 5, 10);
		System.out.println(mb.toString());
	}
}


class MountainBike extends Bicycle{
	public int seatHeight;
	
	public MountainBike(int gear, int speed, int startHeight) {
		super(gear,speed);
		seatHeight = startHeight;
	}
	
	public void setHeight(int newValue) {
		this.seatHeight = newValue;
	}
	
	@Override
	public String toString() {
		return (super.toString() + "\nseat height is " + seatHeight);
	}
}
