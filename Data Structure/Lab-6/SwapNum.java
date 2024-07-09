import java.util.Scanner;
public class SwapNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no a :");
        int a = sc.nextInt();

        System.out.print("Enter no b :");
        int b = sc.nextInt();

        a = a*b;
        b = a/b;
        a = a/b;

        System.out.println("now no a = "+a+"  and no b = "+b);
    }
}
