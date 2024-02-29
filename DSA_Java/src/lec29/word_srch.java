package lec29;
public class word_srch{
    public boolean exist(char[][] board, String word) {
        for(int r = 0; r < board.length; r++) {
            for(int c = 0; c < board[0].length; c++) {
                if(exist(r, c, word, board)) {
                    return true;
                }
            }
        }
        return false; // Moved this line inside the method to return false if nothing found
    }
    
    private boolean exist(int r, int c , String word, char[][] board) {
        if(word.isEmpty()) {
            return true;
        }
        if(r < 0 || c < 0 || r == board.length || c == board[0].length || board[r][c] != word.charAt(0) || board[r][c] == '.') {
            return false;
        }
        String remain = word.substring(1);
        char prev = board[r][c];
        board[r][c] = '.';
        boolean ans = false;
        ans = ans || exist(r - 1 , c, remain, board);
        ans = ans || exist(r + 1, c, remain, board);
        ans = ans || exist(r, c + 1, remain, board); 
        ans = ans || exist(r, c - 1, remain, board) ; // Fixed this line, it should be c - 1 for left
        board[r][c] = prev;
        return ans;
    }
}
