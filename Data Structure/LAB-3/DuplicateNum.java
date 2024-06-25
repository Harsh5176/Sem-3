import java.util.Scanner;
public class DuplicateNum {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter size of array :");
     int size = sc.nextInt();
     
     int [] array = new int[size];

     for(int i=0; i<size ; i++){
        System.out.print("Enter element of []"+i+"] :");
        array[i] = sc.nextInt();
     }

     for(int i=0; i<size; i++){
        for(int j=i+1; j<size; j++){
            if(array[i] == array[j]){
                System.out.println("Duplicate element is : "+array[i]);
     }
 }
     }
    }
}