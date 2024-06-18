package lec48;

import java.util.ArrayList;
import java.util.HashMap;

public class min_con {
    public static void main(String[] args) {
        String s = "catsanddogs";
        String t = "cadacadg";
        solve(s, t); // Call the solve method with the provided strings
    }

    public static void solve(String s, String t) {
        HashMap<Character, ArrayList<Integer>> HM = new HashMap<>();
        for (int idx = 0; idx < s.length(); idx++) {
            ArrayList<Integer> AL = HM.getOrDefault(s.charAt(idx), new ArrayList<>());
            AL.add(idx);
            HM.put(s.charAt(idx), AL);
        }
        int last_char_idx = -1;
        int ans = 1;
        System.out.println(HM);
        for(int idx =0; idx <t.length(); idx++) {
        	char ch = t.charAt(idx);
        	ArrayList<Integer> AL = HM.get(ch);
        	boolean flag = false;
        	for(int i:AL) {
        		if(i>last_char_idx) {
        			last_char_idx =i;
        			flag = true;
        			break;
        		}
        	}
        }
    }
}
