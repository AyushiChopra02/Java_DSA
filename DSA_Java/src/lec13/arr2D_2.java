package lec13;

public class arr2D_2 {
public static void main(String[] args)  {
	int mat[][] = new int[5][3];
	System.out.println(mat.length);
	System.out.println(mat[0].length);
	int cnt=0;
	for(int r=0; r< mat.length; r++) {
		for(int c =0; c<mat[0].length ; c++) {
	mat[r][c]= cnt;
	cnt ++ ;
		}
}
	for(int row[] : mat) {
		for(int ali : row) {
			System.out.print(ali + " ");
			
		}
		System.out.println();
	}
}
}
