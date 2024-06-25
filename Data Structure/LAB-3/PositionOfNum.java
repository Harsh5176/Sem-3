// same element hoy to su kari sakay kai index print karavi.


import java.util.Scanner;

public class PositionOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array :");
        int size = sc.nextInt();
        int [] array = new int[size];

        for(int i=0 ; i<size ; i++){
            System.out.print("Enter element of array[" +i+"]:");
            array[i] = sc.nextInt();
        }
        
        int max=0;
        int min=0;

        for(int i=0 ; i<size ; i++){
            if(i>array[max]){
                max=i;
            }
        }
        for(int i=0 ; i<size ; i++){
            if(i<array[min]){
                min=i;
            }
        }

        System.out.println(max+" "+min);
    }
}
