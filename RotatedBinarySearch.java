
// Program on Rotated Binary Search
public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr={5,6,7,8,1,2,3};
        System.out.println(check(arr, 1, 0, arr.length-1));
    }

    static int check(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        
        int m=s+(e-s)/2;

        if(arr[m]==target){
        return m;
        
    }
    if(arr[s]<=arr[m]){
        if(target>=arr[s] && target<=arr[m]){
            return check(arr, target, s, m-1);
        }else{
            return check(arr, target, m+1, e);
        }
    }
        if(target>=arr[m] && target<=arr[e]){
            return check(arr, target, m+1, e);
        }
        return check(arr, target, s, m-1);
    }
}

