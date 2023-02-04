import java.rmi.dgc.VMID;

public class array1 {
    public static void main(String[] args) {
        int arr[] = { 8, 5, 7, 11, 12, 3, 6 };
        int i = 0;
        int n = arr.length;
        int j = n - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int k = 0; k < n; k++) {
            System.out.println(arr[k] + ",");
        }
    }
}
