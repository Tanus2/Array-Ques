package extensions;


public class approach1 {

    static void approach1(int arr[], int k) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if (sum == k) {
                    System.out.println("Pair found" + arr[i] + "," + arr[j]);
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 9, 4, 2, 1, 10, 5 };
        int k = 7;
        approach1(arr, k);
    }
}
