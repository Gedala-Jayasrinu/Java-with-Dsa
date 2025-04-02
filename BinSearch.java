

import java.util.Arrays;

public class BinSearch {
public static void main(String[] args) {
	int[] arr= {1, 5, 6, 89, 67, 56, 89, 69};
	int target=67;
	Arrays.sort(arr);
	System.out.println("Sorted Array :"+Arrays.toString(arr));
	int ans=BinarySearch(arr,target);
	System.out.println(ans);
}

	static int BinarySearch(int[] arr,int target) {
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			
			int mid=start+(end-start)/2;
			
			if(target<arr[mid]) {
				end=mid-1;
			} else if(target>arr[mid]) {
				start=mid+1;
			}else {
				return mid;
			}
		}
		return -1;
	}
}
