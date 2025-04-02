
public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 6, 25, 48, 5};
        System.out.print(max(arr));
    }
        static int max(int[] arr){
            int maxval=arr[0];
            for(int i=1;i<arr.length;i++){
                if(arr[i]>maxval){
                    maxval=arr[i];
                }
            }
            return maxval;
        }
    }

