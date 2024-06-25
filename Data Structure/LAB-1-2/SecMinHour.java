import java.util.Scanner;
public class SecMinHour {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Seconds : ");
        int second = sc.nextInt();
        int minit=0 , hour=0;

        while(second>60){
            if(second>=60){
                minit++;
                second -= 60;
            }
            if(minit>=60){
                hour++;
                minit -= 60;
            }
        }
        System.out.println("Time In HH:MM:SS IS : " + hour +" : "+ minit +" : "+ second);
    }
}
 