package MidExam;

import java.util.Scanner;

public class Triangle {
	
	
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		double base, height, area;
		
		System.out.println("Enter a base");
		base = input.nextDouble();
		
		System.out.println("Enter a height");
		height = input.nextDouble();
		
		area = 0.5*base*height;
		System.out.println("The area is :"+area);
	}

}
