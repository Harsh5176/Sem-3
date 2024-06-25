import java.util.Scanner;

public class Factotial_Recursion {
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }else{
          return (n * factorial(n-1));
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Number : ");
        int n = sc.nextInt();
        
        int fact = factorial(n);
        System.out.println(fact);
    }
}