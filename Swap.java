
import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 7};
        swap(arr, 1, 4);
        System.out.print(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}