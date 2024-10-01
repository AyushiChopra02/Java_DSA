package lec47;

import java.util.HashMap;

public class intrscn_2array {

    public static void Intersecn(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> HM = new HashMap<>();
        
       
        for (int ali : arr2) {
            int prev = HM.getOrDefault(ali, 0);
            HM.put(ali, prev + 1);
        }
        
       
        for (int ali : arr1) {
            if (HM.containsKey(ali) && HM.get(ali) > 0) {
                System.out.println(ali);
                HM.put(ali, HM.get(ali) - 1); 
            }
        }
    }  
    

    public static void main(String[] args) {
        int[] arr1 = {15, 23, 4, 3, 2};
        int[] arr2 = {4, 3, 2, 1};
        
        Intersecn(arr1, arr2);
    }
}
