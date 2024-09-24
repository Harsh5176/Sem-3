import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        System.out.print("Enter size of array :");
        int size = sc.nextInt();
        int []arr = new int[size];

        for(int i=0; i<size ; i++)
        {
            System.out.print("Enter element of ["+i+"] :");
            arr[i] = sc.nextInt();
        }

        
         for(int i=0; i<size ;i++)
        {
            for(int j=i+1; j<size ;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]= temp;
                }
            }
        }

        for(int i=0 ; i<size ; i++){
            System.out.println();
        }
 
        System.out.print("Enter the element you want to find:");
        int key = sc.nextInt();

        // and the movie starts here 

        int L = 0;
        int R = arr.length-1;

        if(L==R){
            System.out.println("key element not found");
        }
        else{
            while (L<R) 
            {
                int mid = (L+R)/2;
                
                if(arr[mid]==key){
                    System.out.println("key element is found at : "+ mid);
                    break;
                }
                else if(key<arr[mid]){
                    R = mid - 1;
                }
                else if(key>arr[mid]){
                    L = mid + 1;
                }
            }
        }
       
    }
}
