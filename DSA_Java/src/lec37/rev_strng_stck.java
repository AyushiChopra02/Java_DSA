package lec37;

public class rev_strng_stck {
public static void main(String[] args) {

class Stack {
    int size;
    int top;
    char[] a;
 
    Stack(int n)
    {
        top = -1;
        size = n;
        a = new char[size];
    }
 
    // f push element in Stack
    boolean push(char x)
    {
        if (top >= size) {
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            a[++top] = x;
            return true;
        }
    }
 
    //  pop element from stack
    char pop()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            char x = a[top--];
            return x;
        }
    }
}
 

class Main {
    // function to reverse the string
    public static void reverse(StringBuffer str)
    {
        int n = str.length();
        Stack obj = new Stack(n);
 
        
        int i;
        for (i = 0; i < n; i++)
            obj.push(str.charAt(i));
 
        
        for (i = 0; i < n; i++) {
            char ch = obj.pop();
            str.setCharAt(i, ch);
        }
    }
 
    
    public static void main(String args[])
    {
        // create a new string
    	StringBuffer s = new StringBuffer("GeeksQuiz");
    	 
        // call reverse method
        reverse(s);
 
        // print the reversed string
        System.out.println("Reversed string is " + s);
    }
}
}
}
