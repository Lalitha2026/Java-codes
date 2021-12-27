package com.tcs;

public abstract class Government {

	//non-abstract method
public void engine() {
System.out.println("Engine Type : BS-V1");
}	
	
	public void speed() {
System.out.println("Speed Limit : 80");
	}
	
	
	public void disc() {
System.out.println("ABS");
	} //abstract method
	
	public abstract void model(); //unimplemented //signature part

	
	public abstract void color();


	
	
	
}
