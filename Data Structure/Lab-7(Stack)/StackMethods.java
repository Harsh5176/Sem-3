//======================================================================================
// Write a menu driven program to implement following operations on the Stack
// using an Array
//  PUSH, POP, DISPLAY
//  PEEP, CHANGE
//======================================================================================

import java.util.Scanner;

class StackDemo{
    int [] array ;
    int top = -1;
    int size = 0; // it's ohky if you don't write.

    // constrctor 
    StackDemo(int size){
        array = new int[size];
        this.size = size;
    }
    
//================================= Push method ===========================================

    void push(int x){
        if(top >= size-1){
            System.out.println("Stack overflow");
        }
        else{
            top++;
            array[top]=x;
            System.out.println("Element is pushed successfully");
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
//================================= Peep method ===========================================

int peep(int i){
    
    if(top-i+1<=0){
        System.out.println("stack underflow");
        return -1;
    }
    else{
        return (array[top-i+1]);
    }
}
//================================= Change method ===========================================

int change(int i ,int x){
    
    if(top-i+1<=0){
        System.out.println("Place enter valid  Index");
            return -1;
        }
        else{
            int y = array[top-i+1];
            System.out.println("Your changes are done successfully");
            return y;
        }
    }
//================================= Display method ===========================================

    void display(){
        for(int i=0; i<size; i++){
            System.out.println("Element of array["+i+"] is : "+array[i]);
        }
    }
}

public class StackMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of stack:");
        int size = sc.nextInt();
        
        StackDemo s = new StackDemo(size);
        
        System.out.print("Enter 1 if you want to push element in the stack,");
        System.out.print("Enter 2 if you want to delete element from the stack,");
        System.out.print("Enter 3 if you want to see the any element of the stack,");
        System.out.print("Enter 4 if you want to change any element of the stack,");
        System.out.print("Enter 5 if you want to display the stack");
        System.out.print("Enter 6 if you don't have any further changes");

        boolean isTheEnd = false;
        while (true) {
            System.out.println("Please enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the element to be pushed : ");
                    int x = sc.nextInt();
                    s.push(x); 
                    break;
                case 2:
                    int popped = s.pop();
                    if (popped == -1) {
                        System.out.println("Stack underflow");
                    } else {
                        System.out.println("Popped element is: " + popped);
                    }
                    break;
                case 3:
                    System.out.print("Enter the index to see the element : ");
                    int i = sc.nextInt();
                    int peep = s.peep(i);
                    if (peep == -1) {
                        System.out.println("Invalid Index");
                    } else {
                        System.out.println("Element at index " + i + " is: " + peep);
                    }
                    break;
                case 4:
                    System.out.print("Enter the index and the new element to change : ");
                    System.out.print("i = ");
                    i = sc.nextInt();
                    System.out.print("x = ");
                    x = sc.nextInt();
                    s.change(i, x);
                    break;
                case 5:
                    s.display();
                    break;
                case 6:
                    isTheEnd = true;
                    break;
                default:
                    System.out.println("Please Enter valid choice");
            }
            if (isTheEnd) {
                break;
            }
        }
        System.out.println("Program Terminates");
        sc.close();
    }
}
