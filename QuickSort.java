import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        
        int[] arr={8, 9, 5,84, 32, 1};
        sort(arr, 0, arr.length-1);
        System.out.print(Arrays.toString(arr));
    }

    static void sort(int[] nums,int low,int hi){
        if(low>=hi){
            return;
        }
        int s=low;
        int e=hi;
        int mid=s+(e-s)/2;
        int pivot=nums[mid];

        while (s<=e) {
            while (nums[s]<pivot) {
                s++;
            }
            while (nums[e]>pivot) {
                e--;
            }
            if(s<=e){
                int temp=nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                s++;
                e--;
            }
        }
        sort(nums, low, e);
        sort(nums,s,hi);
    }
}