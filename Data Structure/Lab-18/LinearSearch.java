/**
 * LinearSearch
 */
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of an array:");
        int n = sc.nextInt();

        int [] arr = new int[n];
         
        for(int i=0;i<n;i++){
            System.out.print("arr["+i+"]=");
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the element you want to find:");
        int key = sc.nextInt();

        int index = -1;
        for(int i=0 ; i<arr.length ; i++){

            if(arr[i]==key){
                index = i;
                break;
            }
        }

        if(index == -1){
            System.out.println("key element is not found");
        }
        else{
            System.out.println("key element is found at : "+ index);
        }

        int mid = (L+R)/2;
        System.out.println(mid);
    }
    
}