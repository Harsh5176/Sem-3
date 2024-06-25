import java.util.Scanner;

public class Fibonacci {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :");
        int number = sc.nextInt();

        int a=0;
        int b=1;
        int series=0;

        for(int i=0; i<=number; i++){
            series = a + b;
            a = b;
            b = series;
            System.out.print("  "+series);
        }
    }
}
