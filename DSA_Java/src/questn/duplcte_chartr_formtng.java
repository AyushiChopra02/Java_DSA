package questn;

import java.util.Scanner;

public class duplcte_chartr_formtng {
public static void main(String[] args) {
	
	    Scanner sc= new Scanner(System.in);
			        String str1 = sc.next();
			        System.out.println(duplet(0,1, new StringBuilder(str1)));
			    }
			    public static StringBuilder duplet(int i,int j,StringBuilder sb){
			      if(j==sb.length()){
//			         String  str1= sb.toString();
//			          System.out.println(sb);
			          return sb ;
			      }
			       if(sb.charAt(i)==sb.charAt(j)){
			        sb =sb.insert(i+1,'*');
			       }
			       return duplet(i+1,j+1,sb);
		}


	    



}
