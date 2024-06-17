package lec47;

import java.util.ArrayList;

public class HashMap {
public static void main(String[] args) {
	//HashMap<Key ,Val>
	HashMap HM = new HashMap();
	HM.put("A" , 10);
	HM.put("BD" , 20);
	HM.put("cf" , 30);
	HM.put("dz" , 40);
	System.out.println(HM);
	HM.put("A", null);
	System.out.println(HM);
	
	System.out.println(HM.get("A"));
	System.out.println(HM.get("zB"));
	
	

	System.out.println(HM.containsKey("A"));
	
}
//ArrayList<String> AL_keys = new ArrayList<>(HM.keySet());

private void put(String string, Object object) {
	// TODO Auto-generated method stub
	
}

private char[] containsKey(String string) {
	// TODO Auto-generated method stub
	return null;
}

private char[] get(String string) {
	// TODO Auto-generated method stub
	return null;
}
}
