
import java.util.Scanner;

public class AscendingInsert {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        System.out.print("Enter size of array :");
        int size = sc.nextInt();
        int []array = new int[size];

        for(int i=0; i<size ; i++){
            System.out.print("Enter element of ["+i+"] :");
            array[i] = sc.nextInt();
         }

        
         for(int i=0; i<size ;i++){
            for(int j=i+1; j<size ;j++){
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j]= temp;
                }
            }

         }
         

        //  System.out.print("Enter a index :");
        //  int index = sc.nextInt();

         System.out.print("Enter a element:");
         int element = sc.nextInt();

         int [] array2= new int[size+1];
         int i=0;

        while(array[i]<element){
            array2[i]=array[i];
            i++;
        }

        array2[i] = element;

        for(int j=i+1; j<size+1 ;j++){
            array2[j] = array[j-1];
        }
        

        for(int j=0; j<size+1 ;j++){
            System.out.println(array2[j]);
        }    
    }
}
