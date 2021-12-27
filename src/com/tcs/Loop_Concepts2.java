package com.tcs;

public class Loop_Concepts2 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) { //row
			for (int j = 0; j < 6; j++) { //column
				System.out.print(j);
			}
			
		System.out.println();
		
		}
		
		for (int i = 1; i < 5; i++) { //row
			for (int j = 0; j < i; j++) { //column
				System.out.print(j);
			}
			
		System.out.println();
		}
			
		for (int i = 1; i < 6; i++) { //row
			for (int j = 0; j < i; j++) { //column
				System.out.print("*");
			}
			
		System.out.println();
		
	}
	
	for (int i = 5; i >= 1; i--) { //row
		for (int j = 1; j <= i; j++) { //column
			System.out.print("*");
		}
		
	System.out.println();
	}
	
	}
	
}
