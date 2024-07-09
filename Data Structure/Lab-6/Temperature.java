import java.util.Scanner;

class conversion{

    void ConversionF(double Temperature ){
        double Celsius = Temperature-32*5/9;
    	System.out.println(Celsius);
    }
    void ConversionC(double  Temperature){
        double Fahrenhit = (Temperature+32)/9*5;
    	System.out.println(Fahrenhit);
    }
}
public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1 for Celsius and 0 for Fahrenhit :");
        double n = sc.nextInt();

        System.out.print("Enter Temperature :");
        double Temperature = sc.nextInt();

        if(n==1){
         conversion Fahrenhit = new conversion();
         Fahrenhit.ConversionF(Temperature);
        }
        else if(n==0){
         conversion Celsius = new conversion();
         Celsius.ConversionF(Temperature);
        }
        
    }
}
