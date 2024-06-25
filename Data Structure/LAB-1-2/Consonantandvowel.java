import java.util.Scanner;
public class Consonantandvowel{
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.println("enter you line/string : ");
	String str = sc.nextLine();

		int consonant=0,vowel=0,space=0;

		for(int i=0;i<str.length();i++){

			char ch = str.charAt(i);

			if("aeiouAEIOU".indexOf(ch) >= 0){
				vowel++;
			}
			
			else{
				consonant++;
			}
		}
		

			//if( ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ){
			//	vowel=vowel+1;
			//}
			//else if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
			//	consonant=consonant+1;
			//}
		//}	
		System.out.println("Total vowel are : " +vowel);
		System.out.println("Total space are : " +space);
		System.out.println("Total consonants are : " +consonant);
	}
}