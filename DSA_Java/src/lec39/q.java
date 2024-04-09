package lec39;

import java.util.Stack;

public class q {
	
	    public String decodeString(String s) {
	        Stack<Integer> countStack = new Stack<>();
	        Stack<StringBuilder> stringStack = new Stack<>();
	        StringBuilder currentString = new StringBuilder();
	        int currentCount = 0;

	        for (char ch : s.toCharArray()) {
	            if (Character.isDigit(ch)) {
	                currentCount = currentCount * 10 + (ch - '0');
	            } else if (ch == '[') {
	                countStack.push(currentCount);
	                stringStack.push(currentString);
	                currentCount = 0;
	                currentString = new StringBuilder();
	            } else if (ch == ']') {
	                StringBuilder previousString = stringStack.pop();
	                int repeatTimes = countStack.pop();
	                for (int i = 0; i < repeatTimes; i++) {
	                    previousString.append(currentString);
	                }
	                currentString = previousString;
	            } else {
	                currentString.append(ch);
	            }
	        }

	        return currentString.toString();
	    }
	}


