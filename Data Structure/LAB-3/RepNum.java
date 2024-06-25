
import java.util.Scanner;

public class RepNum {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array :");
        int size = sc.nextInt();
        int []array = new int[size];

        for(int i=0; i<size ; i++){
            System.out.print("Enter element of ["+i+"] :");
            array[i] = sc.nextInt();
         }

         System.out.print("Enter a First no M:");
         int M = sc.nextInt();

         System.out.print("Enter a First no N:");
         int N = sc.nextInt();

         for(int i=0; i<size ;i++){

            if(M==array[i]){
                array[i]=N;
            }
         }

         for(int i=0; i<size ;i++){

            System.out.print(array[i]+" ");
         }
    }
}
