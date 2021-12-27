package com.tcs;

public class Child extends Parent{

	
	@Override
	public void house(String a) {
		
		super.house(a);//reference of parent class
	}
	
	
	public static void main(String[] args) {
	Child ch = new Child();
	ch.house("Affection");
		
	//up casting child to parent
	Parent p= new Parent();
			p.house("Source");
	//down casting parent to child
	Child c= new Child();
	
			c.house("House Hold");
	
	
	
	}	
	
}
