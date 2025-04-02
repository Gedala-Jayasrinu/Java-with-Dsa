public class FindUnqElement {
    
public static void main(String[] args) {
    int[] arr={2,2,5,6,6,8,8};
    System.out.println(repeat(arr));
    }
    
    private static int  repeat(int[] arr) {
        int unq=0;
     for(int num :arr){
       unq^=num;
     }
     return unq;
}
}
