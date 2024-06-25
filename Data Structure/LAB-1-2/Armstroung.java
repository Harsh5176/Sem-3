


public class Armstroung {
     
    static  void isarmstroung(int number){

        int length =String.valueOf(number).length();
        
        int sum=0 , lastdigit = 0 ;
        int temp = number;
        while(temp!=0){
            lastdigit = temp % 10;
            sum = sum + (int)Math.pow(lastdigit, length);
            temp = temp / 10;
        }

        if(number == sum){
           System.out.println(number + " is an Armstrong number.");
        }
}

    public static void main(String[] args) {

        for(int i=1 ; i<=1000 ; i++){
            
            isarmstroung(i);
         
                
            }
        }

}

