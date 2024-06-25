import java.util.Scanner;

public class InsertNum {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array :");
        int size = sc.nextInt();
        int []array = new int[size];

        for(int i=0; i<size ; i++){
            System.out.print("Enter element of ["+i+"] :");
            array[i] = sc.nextInt();
         }

         System.out.print("Enter a index :");
         int index = sc.nextInt();

         System.out.print("Enter a element:");
         int element = sc.nextInt();

         int [] array2= new int[size+1];
         
         for(int i=0; i<index; i++){
            
            array2[i]=array[i];
         }
         array2[index] = element;

         for(int i=index+1; i<size+1; i++){
            
            array2[i]=array[i-1];
         }


         for(int i=0; i<size+1; i++){
            
            System.out.println(array2[i]+" ");
         }



    }
}
