package lec47;

import java.util.HashSet;

public class longestchain {
private static int[] arr;

public static void main(String[] args) {
	HashSet<Integer> Set = new HashSet<>();
	for(int ali : arr) {
		Set.add(ali);
	}
	for(int ali : arr){
		Set.add(ali);
		if(!Set.contains(ali-1)){
			//ali is the strting point of chain
			int nn = ali;
			while(Set.contains(nn)) {
				System.out.println()  ;
				nn++;
				
				 
				
			}
			System.out.println();
		}
	} 
}
}  
