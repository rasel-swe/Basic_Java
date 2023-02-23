package MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class Array5 {
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);	
	
	int [] n = new int [5];
	for(int i = 0; i<n.length; i++) {
		n[i] = input.nextInt();	
	}
	
	Arrays.sort(n);
	for (int i = 0; i< n.length;i++) {
		System.out.print(n[i]+" ");
	}
	//System.out.println();
}
}
