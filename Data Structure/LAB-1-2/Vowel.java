import java.util.Scanner;
public class Vowel {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your String : ");
        String str = sc.nextLine().toLowerCase();
        int vowel = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if("aeiou".indexOf(ch) != -1){
                vowel++;
            }
        }
        System.out.println(vowel);
    }
}
