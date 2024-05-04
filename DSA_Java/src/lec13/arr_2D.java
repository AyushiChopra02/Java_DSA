package lec13;

public class arr_2D {
public static void main(String[] args) {
	int mat [] [] = new int[5][3];
	System.out.println(mat);
	System.out.println(mat.length);
	
	for(int[] row : mat) {
		for(int ali :row) {
			System.out.println(ali + " ");
			
		}
		System.out.println();
	}
	System.out.println("=========")  ;
	mat[0][0] = 1;
	mat[0][1] = 2;
	mat [0][2] = 3;
	for( int row[] : mat) {
		for(int ali : row) {
			System.out.println(ali + " ");
		}
		System.out.println();
	}
}
}
