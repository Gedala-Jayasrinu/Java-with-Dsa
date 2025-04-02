
public class Lsearch {
    public static void main(String[] args) {
        int[] arr= {25,48,76};
        int target=76;
        int ans=linearsearch(arr,target);
        System.out.println(ans);
    }


    static int linearsearch(int[] arr,int target) {

        for(int i=0;i<=arr.length;i++) {
            int element=arr[i];
            if(element==target) {
                return i;
            }
        }

        return -1;
    }
}
