package MidExam;

public class Array3 {
	
	public static void main(String[] args) {
		int k  = 0;
		int [] [] n = new int [5][];
		
		n[0] = new int [1];
		n[1] = new int [2];
		n[2] = new int [3];
		n[3] = new int [4];
		n[4] = new int [5];
		
		
		for (int i = 0; i<5; i++) {
			for (int j = 0; j<i+1; j++) {
				
				n[i][j] = k;
				k++;
			}
		}
		
		for (int i = 0; i<5; i++) {
			for (int j = 0; j<i+1; j++) {
				System.out.print(n[i][j]+" ");
				
			}
			System.out.println();
			}
	}

}
