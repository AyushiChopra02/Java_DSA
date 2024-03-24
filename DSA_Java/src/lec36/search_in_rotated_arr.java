package lec36;

public class search_in_rotated_arr {
	
	    public int search(int[] arr, int ali) {
	        int s =0;
	        int e= arr.length-1;
	        while(s<=e){
	            int mid = (s+e)/2;
	            int pivot = arr[(s+e)/2]; //mid pt pr jo elmnt h usay pivot khte h
	               
	            if(arr[mid]== ali){ //agr pivot or search elmt(ali) same h to indx return krenge
	                return mid;
	            }
	            if(s==e){ //strt or end idx same hogya mtlb mid pt nai mila to return -1
	                return -1;
	            }
	            // Agar array sorted hai aur pivot search element se bada hai ..End ko mid-1 pe le jate. kuki agr pivot bda h to..pivot ke left side mein search kar rahe hain. Agar pivot hi humara target hota, to hume pivot ka index chahiye hota, jo mid hai. Lekin kyunki hum pivot se bade element ki taraf ja rahe hain, hume pivot ke left side mein search karna hai, isliye hum end ko mid - 1 pe set kar rahe hain. Yeh hume mid se left side ke part mein search karne ka signal deta hai.
	            if(arr[s]<arr[e] && pivot >ali){ 
	                e=mid -1;
	            }else if(arr[s] < arr[e] && pivot < ali){ //pivot srch elmnt se chota h to right side chck krnge 
	                s= mid+1;
	            }
	            else if(arr[s] > arr[e]){ //arr rotated h kuki s bda h
	                if(arr[s] <= pivot && ali < pivot && ali >= arr[s]){ // Agar pivot left side hai aur ali bhi left side hai
	                    e =mid-1; //end ko mid-1 lejnege
	                }else if(arr[s] <= pivot){ //agr pivot left side hai
	                    s =mid +1; // Start ko mid+1 pe le jaate hain
	                }
	                else if(arr[s] >= pivot && ali > pivot && ali <= arr[e]){
	                    // Agar pivot right side hai aur ali bhi right side hai 
	                    s= mid+1; // Start ko mid+1 pe le jaate hain

	                }else if(arr[s] >= pivot){ // Agar pivot right side hai
	                    e = mid -1; //End ko mid-1 pe le jaate hain
	                }
	            }
	        }
	        return -1; // Agar element nahi mila, toh -1 return karte hain
	    }
	}

