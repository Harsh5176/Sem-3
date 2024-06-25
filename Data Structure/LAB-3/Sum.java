// size of array in this case is n-m+1=size  


import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first no m :");
        int m = sc.nextInt();

        System.out.print("Enter a first no n :");
        int n = sc.nextInt();

        int sum = 0 ;

        for(int i=m ; i<=n ; i++){
            sum = sum + i;
        } 
        System.out.println("Sum of numbers between "+m+" and "+n+" is = "+sum);
    }
}
