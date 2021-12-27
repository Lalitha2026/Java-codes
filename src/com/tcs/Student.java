package com.tcs;
//class name
public class Student {

	
	//constructor
	public Student() { //non parameterized // Default
System.out.println("Default Constructor");
	}
	
	
	public Student(int a) { // parameterized constructor
		System.out.println(a);
			}
	//main method
	public static void main(String[] args) {
		Student s = new Student();
		Student s1= new Student(916);
		}
}
 