import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        
        System.out.print("Enter size of array :");
        int size = sc.nextInt();
        int []arr = new int[size];

        for(int i=0; i<size ; i++)
        {
            System.out.print("Enter element of ["+i+"] :");
            arr[i] = sc.nextInt();
        }

        for(int i=0 ; i<size-1 ; i++)
        {
           

        }

        for (int i = 0; i <size; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
