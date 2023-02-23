package MidExam;

import java.util.Scanner;

public class Cycle {
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		double redius, area;
		
		System.out.println("Enter the redius: ");
		redius = input.nextDouble();
		 area = 3.1416* redius* redius;
		 
		 System.out.println("The area is :"+area);
	}

}
