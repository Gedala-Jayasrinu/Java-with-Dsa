

public class MinValue {
public static void main(String[] args) {
	int[] arr= {25, 65, -87, 63};
	System.out.println(min(arr));
}
static int min(int[] arr) {
	int ans=arr[0];
	for(int i=0;i<=arr.length;i++) {
		if(arr[i]<ans) {
			ans=arr[i];
			return ans;
		}
	}
	return -1;
}
}
