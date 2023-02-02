package extensions;

import java.util.Arrays;

public class approach2 {

    static void approachfin(int arr[], int k) {

        Arrays.sort(arr);
        int sum = 0;
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {

            sum = arr[i] + arr[j];
            if (sum == k) {
                System.out.println("Pair found" + arr[i] + "," + arr[j]);
                return;
            }
            if (arr[i] + arr[j] < k) {
                i++;
            } else if (arr[i] + arr[j] > k) {
                j--;
            }

        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 9, 4, 6, 3, 10, 5 };
        int k = 16;
        approachfin(arr, k);
    }
}
