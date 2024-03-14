package questn;
import java.util.Scanner;
public class Obedient_String {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String str = scanner.nextLine();
	        System.out.println(checkString(str) ? "true" : "false");
	    }
	    public static boolean checkString(String str) {
	        // string khali h
	        if (str.isEmpty()) {
	            return true;
	        }
	        // agr string  'a' se strt h , recursively check  substring  'a' k baad
	        if (str.startsWith("a")) {
	            return checkString(str.substring(1));
	        }
	        // agr string starts with "bb", recursively check  substring "bb" k baad
	        if (str.startsWith("bb")) {
	            // If there is an 'a' following "bb"
	            if (str.length() >= 3 && str.charAt(2) == 'a') {
	                return checkString(str.substring(3)) ;
	            } else {
	                // agr kuj ni h following "bb", return false
	                return false;
	            }
	        }
	        // agr string in dono  se strt nai hori 'a' or "bb", it doesn't follow  rules
	        return false;
	    }
	}


