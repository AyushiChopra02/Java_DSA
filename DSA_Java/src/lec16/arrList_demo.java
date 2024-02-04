package lec16;

import java.util.ArrayList;

public class arrList_demo {
public static void main(String[] args) {
	ArrayList<Integer> AL = new ArrayList<Integer>();	
	System.out.println(AL);
	AL.add(10);
	System.out.println(AL);
	//AL size
	System.out.println(AL.size()) ;
	AL.add(50);
	System.out.println(AL);
	
	//indexing
	System.out.println(AL.get(0));
	System.out.println(AL.get(AL.size()-1));
}
}
