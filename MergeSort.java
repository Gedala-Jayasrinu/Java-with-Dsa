import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        arr=merge(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] merge(int[] arr){
        //If only one element is present in array then it return the element
        if(arr.length==1){
            return arr;
        }
        //Divide the array 
        int mid=arr.length/2;

        //These sorts the divided arrays and copy it in a seperate objects
       int[] left=merge(Arrays.copyOfRange(arr, 0, mid));
       int[] right=merge(Arrays.copyOfRange(arr, mid, arr.length));
       return mergesort(left,right);
           }
       
           private static int[] mergesort(int[] first, int[] second) {
            //Now merge the seperated sorted arrays
               int[] mix=new int[first.length+second.length];

              int i=0;//i is the pointer in the 1st array
              int j=0;//j is the pointer in the 2nd array
              int k=0;//k is the pointer in the new merged array

              while (i<first.length && j<second.length) {

                if(first[i]<second[j]){
                    mix[k]=first[i];
                    i++;
                }else{
                    mix[k]=second[j];
                    j++;
                }
                k++;
              }
              //If there is still not completed then the other elements will be added in it
              while (i<first.length) {
                mix[k]=first[i];
                i++;
                k++;
              }
              //If there is still not completed then the other elements will be added in it
              while (j<second.length) {
                mix[k]=second[j];
                j++;
                k++;
              }
              return mix;
           }

}
