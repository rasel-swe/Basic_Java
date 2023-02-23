package MidExam;

import java.util.Scanner;

public class Array {
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		double [] number = new double[5];
		
		double sum = 0;
		
		System.out.println("Enter 5 number");
		
		for(int i = 0; i<5; i++) {
			
			number[i] = input.nextDouble();
			
		}
		
		
		for(int i = 0; i<5; i++) {
			
			sum = sum + number [i];
		}
		System.out.println("The sum is: "+sum);
		
		System.out.println("The avarage is : "+sum/5);
	}

}
