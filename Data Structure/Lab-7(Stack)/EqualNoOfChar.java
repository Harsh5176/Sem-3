//========================================================================================
// 40. Write a program to determine if an input character string is of the form a^ib^i
// where i >= 1 i.e., Number of ‘a’ should be equal to number of ‘b’.
// Valid strings are abab ; aabb ; ababab
// Invalid strings are aaabb ; ababb ; aaaaa ; bbbbb
//========================================================================================

import java.util.Scanner;

class Equal{
    char [] array ;
    int top = -1;
    int size = 0; // it's ohky if you don't write.

    // constrctor 
    Equal(int size){
        array = new char[size];
        this.size = size;
    }
//================================= Push method ===========================================

    void push(char x){
        if(top >= size-1){
            System.out.println("Stack overflow");
        }
        else{
            top++;
            array[top] = x;
        }
    }

//================================= Pop method ===========================================
    int pop(){
    // in pop and peep method we have to return in both if and else block
    // otherwise gets an error

        if(top==-1){
            //here in this condition top == (declered) in this case we declered -1 above
            System.out.println("Stack Underflow");
            return -1;
        }
        else{
            top--;
            return array[top++]; 
        }
    }
}

public class EqualNoOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String which only have a and b : ");
        String st = sc.nextLine();

        int A=0 , B=0;

        for(int i=0 ; i<st.length() ; i++){

            if(st.charAt(i)=='a'){
                A++;
            }
            else{
                B++;
            }
        }

        if(A==B){
            System.out.println("given string is valid");
        }
        else{
            System.out.println("given string is invalid");
        }
    }
}
