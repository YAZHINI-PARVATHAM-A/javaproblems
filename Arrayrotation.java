package ort.array;
import java.util.*;

public class Arrayrotation {

    static void reverse(int[] arr, int start, int end) {
        int i = start, j = end - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n);
        reverse(arr, 0, k);
        reverse(arr, k, n);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        int k = 0;

        rotate(arr, k);

        for (int i : arr) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
