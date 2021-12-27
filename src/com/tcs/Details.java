package com.tcs;
//Class name
public class Details {

	//method name
 public void text(String a) {
	System.out.println(a);

}	
	
	
 public void text(int b) {
		System.out.println(b);

 }
 
 public void text(String a, int b) {
		System.out.println(a+b);
			
	
} 
 //main method
 public static void main(String[] args) {
	 //object creation
	Details stud = new Details();
	//method calling
	stud.text("Legha");
	stud.text(2026);
	stud.text("Legha", 2026);
 }

}