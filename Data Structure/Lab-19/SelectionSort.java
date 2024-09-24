import java.util.Scanner;

public class SelectionSort{
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
            int mindex = i; 
            for(int j=i+1 ; j<size ; j++)
            {
                if(arr[j]<arr[mindex])
                {
                    mindex = j;
                }
            }
            
            if(mindex != i)
            {
                int temp = arr[i];
                arr[i] = arr[mindex];
                arr[mindex] = temp;
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
