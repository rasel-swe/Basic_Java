package MidExam;

public class ddArray {
	
	public static void main(String[] args) {
		int [][] n = new int [2] [3];
		
		n [0][0] = 10;
		n [0][1] = 20;
		n [0][2] = 30;
		n [1][0] = 40;
		n [1][1] = 50;
		n [1][2] = 60;
		
		for (int row = 0; row < 2; row++) {
			for(int col = 0; col< 3; col++) {
				System.out.print(" "+n[row][col]);
			}
			System.out.println();
		}
		
	}

}
