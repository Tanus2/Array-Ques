public class leaderelement {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 6, 8, 9, 10, 12, };
        int n = arr.length;
        int max = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > max) {
                System.out.println("leader element : " + arr[i]);
                max = arr[i];
            }
        }
    }
}
