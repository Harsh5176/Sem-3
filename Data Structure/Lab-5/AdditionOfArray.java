// 30. Read two 2x2 matrices and perform addition of matrices into third matrix and 
// print it


import java.util.Scanner;
public class AdditionOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number of rows :");
        int r = sc.nextInt();
        
        System.out.print("Enter a number of cols :");
        int c = sc.nextInt();
        
// ---------------------------------------------------------1nd array-----------------------------------------------------------------------------

        int [][] array1 = new int[r][c];

        // outer loop for rows
        for(int i=0 ; i<r ; i++){

            // inner loop for cols
            for(int j=0 ; j<c ; j++){

                System.out.print("Enter an element of array1["+i+"]["+j+"] :");
                array1[i][j] = sc.nextInt();
            }
        }
        // printing of array [1]
        for(int i=0 ; i<r ; i++){

            for(int j=0 ; j<c ; j++){

                System.out.print(array1[i][j]+" ");

            }
             System.out.println("");
        }

// ---------------------------------------------------------2nd array-----------------------------------------------------------------------------

        int [][] array2 = new int[r][c];

        // outer loop for rows
        for(int i=0 ; i<r ; i++){

            // inner loop for cols
            for(int j=0 ; j<c ; j++){

                System.out.print("Enter an element of array2["+i+"]["+j+"] :");
                array2[i][j] = sc.nextInt();
            }
        }
        // printing of array [2]
        for(int i=0 ; i<r ; i++){

            for(int j=0 ; j<c ; j++){

                System.out.print(array2[i][j]+" ");

            }
             System.out.println("");
        }
// ------------------------------------------Addtion of array------------------------------------------------------------------------------------

        int [][] sum = new int[r][c];

        for(int i=0; i<r; i++){
            for(int j=0 ;j<c ;j++){

                if(array1[i][j]==array2[i][j]){

                    sum[i][j] = array1[i][j] + array2[i][j];
                }

            }
        }


        System.out.println("Sum of array1 and array2 ");
        for(int i=0 ; i<r ; i++){

            for(int j=0 ; j<c ; j++){

                System.out.print(sum[i][j]+" ");

            }
             System.out.println("");
        }

    }
}