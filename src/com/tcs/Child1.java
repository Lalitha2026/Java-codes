package com.tcs;

public class Child1 implements Parent1, Parent2{

	@Override
	public void gift2() {
		System.out.println("Bike1");
	}

	@Override
	public void gift1() {
		System.out.println("Bike2");
	}
public static void main(String[] args) {
	Child1 c = new Child1();
	c.gift1();
	c.gift2();
}
}
