

import java.util.Arrays;
import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];

        // Input
        System.out.println("Enter 9 integers for a 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        // Output
        System.out.println("The 3x3 matrix is:");
        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
                System.out.print(Arrays.toString(arr[i])); // Add a space for readability
            }
            in.close();
//            System.out.println();
        }

     // Good practice to close the Scanner
    }

