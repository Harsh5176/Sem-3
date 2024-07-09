//=======================================================================================
// 39. How stack can be used to recognize strings aca, bcb, abcba, abbcbba? Write a
// program to solve the above problem.
// In this we pass string w{a,b} ; C="c is sparetor" ; w'{a,b} abcba
// If w and w' are same then given string is valid else invalid
//=======================================================================================

import java.util.Scanner;

class StringRecognize{
    char [] array ;
    int top = -1;
    int size = 0; // it's ohky if you don't write.

    // constrctor 
    StringRecognize(int size){
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
//================================= Display method ===========================================

    void display(){
        for(int i=0; i<size; i++){
            System.out.println("Element of array["+i+"] is : "+array[i]);
        }
    }
}


public class StringsRecognizeWithStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String and please space at the end : ");
        String st = sc.nextLine();
        
        StringRecognize string = new StringRecognize(st.length());

        // here we declered index so that we can start chacking after seprator(in this case "c")
        int index = 0;

        for(int i=0 ; i<st.length() ; i++){

            //here we push elements from st(given string) to new string(which we created with constroctor)
            // untill we get seprator(in this case "c") 

            if(st.charAt(i)=='c'){
                index = i;
               break;
            }
            else{
                string.push(st.charAt(i));
            }
        }

        boolean ans = true;
        for(int i=index+1 ; i<st.length() ; i++){
            
            if(st.charAt(i)!=string.pop()){
                ans = false;
                break;
            }
        }
        
        if(ans){
            System.out.println("given string is valid");
        }
        else{
            System.out.println("given string is invalid");
        }


    }
}
