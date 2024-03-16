package questn;

import java.util.Scanner;

public class chessboard {
public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			int size = scn.nextInt();

			System.out.println(chessboardPaths(0, 0, new int[size - 1][size - 1], ""));}

		private static int chessboardPaths(int cr, int cc, int[][] board, String ans) {

			int count = 0;
			if (cr == board.length && cc == board[0].length) {
				System.out.println(ans + "{" + cr + "-" + cc + "}" + " ");
				return 1;
			}
			if (cr > board.length || cc > board[0].length) {
				return 0;
			} 
			count += chessboardPaths(cr + 2, cc + 1, board, ans + "{" + cr + "-" + cc + "}K");
			count += chessboardPaths(cr + 1, cc + 2, board, ans + "{" + cr + "-" + cc + "}K");

			// Rook
			if (cr == board.length || cc == board[0].length || cr == 0 || cc == 0) {
				for (int move = 1; move <= board.length; move++)
					count += chessboardPaths(cr, cc + move, board, ans + "{" + cr + "-" + cc + "}R");
				for (int move = 1; move <= board.length; move++)
					count += chessboardPaths(cr + move, cc, board, ans + "{" + cr + "-" + cc + "}R");

			}		
			if (cr + cc == board.length || cr == cc) {
				for (int move = 1; move <= board.length; move++) {
					count += chessboardPaths(cr + move, cc + move, board, ans + "{" + cr + "-" + cc + "}B");
				}
			}
			return count;
		
	}
}

