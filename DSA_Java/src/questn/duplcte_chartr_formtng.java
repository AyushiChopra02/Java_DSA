package questn;

import java.util.Scanner;

public class duplcte_chartr_formtng {
public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the string: ");
	        String str = scanner.nextLine();
	        String result = formatDuplicateCharacters(str);
	        System.out.println("Updated String: " + result);
	        scanner.close();
	    }
	    public static String formatDuplicateCharacters(String str) {
	        // Base case: agar string ki length 1 ya usse kam hai, toh wahi return karna hai
	        if (str.length() <= 1) {
	            return str;
	        }
	        // Dekhte hain ki pehla character agle ke saath match karta hai ya nahi
	        if (str.charAt(0) == str.charAt(1)) {
	            // Agar match karta hai, toh '*' add karte hain pehle character ke baad
	            return str.charAt(0) + "*" + formatDuplicateCharacters(str.substring(1));
	        } else {
	            // Agar match nahi karta hai, toh wahi character append karte hain
	            return str.charAt(0) + formatDuplicateCharacters(str.substring(1));
	        }
	    }
	}


	    




