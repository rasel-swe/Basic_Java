package MidExam;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {

		/*
		 * int [] n = new int[5];
		 * 
		 * n[0] = 10; n[1] = 10; n[2] = 10; n[3] = 10; n[4] = 10;
		 * 
		 * int length = n.length;
		 * 
		 * System.out.println("The array value is: "+n[3]);
		 * 
		 * System.out.println("The array length is: "+length);
		 * 
		 * int sum = n[0]+ n[1]+ n[2]+ n[3]+ n[4];
		 * 
		 * System.out.println("The sum is: "+sum);
		 * 
		 * 
		 * }
		 */

		Scanner input = new Scanner(System.in);
		double[] n = new double[5];

		System.out.print("Please enter 5 numbers: ");

		for (int i = 0; i < n.length; i++) {
			n[i] = input.nextDouble();
		}

		double sum = 0;

		for (int i = 0; i < n.length; i++) {

			sum = sum + n[i];
		}
		
		double max = n[0];
		double min = n[0];
		for (int i = 1; i< n.length; i++) {
			
			if (max<n[i]) {
				max = n[i];
			}
			
			if (min>n[i]) {
				min = n[i];
			}
		}
		
		
		

		System.out.println("The sum is : " + sum);
		System.out.println("The avarage is : " + sum / 5);
		System.out.println("The max is : " + max);
		System.out.println("The min is : " + min);

	}
}
