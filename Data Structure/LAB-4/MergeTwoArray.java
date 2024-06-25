import java.util.Scanner;

public class MergeTwoArray {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of 1st array :");
        int size1 = sc.nextInt();
        int []array1 = new int[size1];

        for(int i=0; i<size1 ; i++){
            System.out.print("Enter element of ["+i+"] :");
            array1[i] = sc.nextInt();
         }


        
        System.out.print("Enter size of 2st array :");
        int size2 = sc.nextInt();
        int []array2 = new int[size2];

        for(int i=0; i<size2 ; i++){
            System.out.print("Enter element of ["+i+"] :");
            array2[i] = sc.nextInt();
         }

        int [] merge = new int[size1+size2];
        int k=0;

        for(int i=0 ; i<size1 ; i++){
            merge[k] = array1[i];
            k++;
        }
        for(int i=0 ; i<size2 ; i++){
            merge[k++] = array2[i];
        }


        for(int i=0; i<size1+size2 ;i++){

            System.out.print(merge[i]+" ");
         }

    }
}
