//============================================================================================================
// 41. Chef has a string which contains only the characters '{', '}', '[', ']', '(' and ')'. Now
// Chef wants to know if the given string is balanced or not. If is balanced then
// print 1, otherwise print 0.
//      A balanced parenthesis string is defined as follows:
//          oThe empty string is balanced
//          oIf P is balanced then (P), {P}, [P] is also balanced
//          oif P and Q are balanced PQ is also balanced
//          o"([])", "({})[()]" are balanced parenthesis strings
//          o"([{]})", "())" are not balanced.
//      Input: The first line of the input contains a single integer T denoting the
//     number of test cases. The description of T test cases follows. The first
//     and only line of each test case contains a single string
//      Output: For each test case, print a single line containing the answer.
//      Example of Input & Output
//          oInput:
//           Enter No of Test Cases: 4
//           ()
//           ([)]
//           ([{}()])[{}]
//           [{{}]
//          oOutput
//           1
//           0
//           1
//           0
//============================================================================================================

import java.util.Scanner;

public class BalancedParenthesis {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String which contains '{}','()','[]' : ");
        String st = sc.nextLine();

        Equal Parenthesis = new Equal(st.length());

        boolean flag = true;
        
        for(int i=0; i<st.length(); i++){

            if(st.charAt(i) == '[' || st.charAt(i) == '{' || st.charAt(i) == '('){
                
                Parenthesis.push(st.charAt(i));
            }
            else{
                if(st.charAt(i)==']'){
                    
                   if( Parenthesis.pop()!='['){
                    System.out.println("Invalid String");
                    flag = false;
                    break;
                }
            }
            else if(st.charAt(i)=='}'){
                if( Parenthesis.pop()!='{'){
                    System.out.println("Invalid String");
                    flag = false;
                    break;
                }
            }
            else if(st.charAt(i)==')'){
                if( Parenthesis.pop()!='('){
                    System.out.println("Invalid String");
                    flag = false;
                    break;
                }
                }
                
            }
        }

        if(flag){
            System.out.println("String is valid");
        }
    }
}
