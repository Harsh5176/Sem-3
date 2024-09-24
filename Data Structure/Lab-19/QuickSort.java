
import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array :");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element of [" + i + "] :");
            arr[i] = sc.nextInt();
        }

        int lb = 0;
        int ub = arr.length - 1;

        QuickSort(arr, lb, ub);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }

    }

    public static void QuickSort(int[] arr, int lb, int ub) {
        boolean flag = true;

        if (lb < ub) {
            int i = lb;
            int j = ub + 1;
            int key = arr[lb];

            while (flag) {
                i = i + 1;

                while (i < arr.length && arr[i] < key) {
                    i = i + 1;

                }
                j = j - 1;

                while (j >= 0 && arr[j] > key) {
                    j = j - 1;
                }
                if (i < j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                } else {
                    flag = false;
                }
            }
            int temp2 = arr[lb];
            arr[lb] = arr[j];
            arr[j] = temp2;

            QuickSort(arr, lb, j - 1);
            QuickSort(arr, j + 1, ub);
        }

    }
}
