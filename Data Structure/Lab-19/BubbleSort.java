import java.util.Scanner;

public class BubbleSort 
{
 
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
            for(int j=0 ; j<size-i-1 ; j++)
            {
                if(arr[j]>arr[j+1]){
                   int  temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                }
            }
        }

        for (int i = 0; i <size; i++) {

            if(i==size-1){
                
                System.out.print(arr[i]);
            }
            else{
                System.out.print(arr[i]+",");
            }
        }
    }
}
