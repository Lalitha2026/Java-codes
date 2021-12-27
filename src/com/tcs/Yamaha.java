package com.tcs;

public class Yamaha extends Government{

	@Override
	public void model() {
		System.out.println("V4");
	}

	@Override
	public void color() {
		System.out.println("Black");
	}

	public static void main(String[] args) {
		Yamaha bike = new Yamaha();
	
				bike.color();
		bike.engine();
		bike.disc();
		bike.model();
		bike.speed();
	}
}
