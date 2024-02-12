package lec20;

public class subarrayK {
public int subarrayDivbyK(int[] nums , int k) {
	//int[] nums =(4,5,0,-2,-3,1);
	int ans =0;
	int sum = 0;
	int arr[] = new int[k];
	for(int ali : nums) {
		sum = sum + ali;
		int idx = sum % k ;
		if (idx<0) {
			idx = idx + k;
}
		if(sum % k ==0) {
			ans ++;
		}
		ans = ans + arr[idx];
		arr[idx]++ ;
}
	return ans ;
}
}
