
//Binary Problem in recursion



public class RecBinary {
    public static void main(String[] args) {

        int[] arr={25, 56, 78, 82, 88};
        int target=56;

        System.out.print(find(arr,target,0,arr.length-1));
    }


    static int find(int[] arr, int target, int s, int e) {

        if (s > e) {
            return -1;
        }
        int m= s+(e-s)/2;
            if(arr[m]==target){
                return m;
            }

            if(target>arr[m]) {
            return find(arr, target, m+1, e);
            }else{
                return find(arr,target,s, m-1);
            }

    }
}