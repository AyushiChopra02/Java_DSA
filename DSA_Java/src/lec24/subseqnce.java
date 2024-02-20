package lec24;

public class subseqnce {
public static void main(String[] args) {
	        String str = "abcd";
	        generateSubsequences(str);
	    }

	    public static void generateSubsequences(String str) {
	        int n = str.length();
	        for (int i = 0; i < (1 << n); i++) {
	        	//yha i binary no. ko gnrte krne k lie use hora h 0 se lekar (1 << n) - 1 tak.
	            StringBuilder subsequence = new StringBuilder() ;
	            for (int j = 0; j < n; j++) {
	                if ((i & (1 << j)) > 0) {
	                    subsequence.append(str.charAt(j)) ;
	                }
	            }
	            System.out.println(subsequence);
	        }
	    }}

