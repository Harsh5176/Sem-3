// 31. Read two matrices, first 3x2 and second 2x3, perform multiplication operation
// and store result in third matrix and print it.

import java.util.Scanner;
public class MultipicationOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st array's  rows :");
        int r = sc.nextInt();
        
        System.out.print("Enter 1st array's  cols :");
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

    System.out.print("Enter 2nd array's  rows :");
        int r2 = sc.nextInt();
        
        System.out.print("Enter 2nd array's  cols :");
        int c2 = sc.nextInt();

        int [][] array2 = new int[r2][c2];

        // outer loop for rows
        for(int i=0 ; i<r2 ; i++){

            // inner loop for cols
            for(int j=0 ; j<c2 ; j++){

                System.out.print("Enter an element of array2["+i+"]["+j+"] :");
                array2[i][j] = sc.nextInt();
            }
        }
        // printing of array [2]
        for(int i=0 ; i<r2 ; i++){

            for(int j=0 ; j<c2 ; j++){

                System.out.print(array2[i][j]+" ");

            }
             System.out.println("");
        }
// ------------------------------Multiplication of array------------------------------------------------------------------------------------

        int [][] sum = new int[r][c2];
        for(int i=0; i<r; i++){
            for(int j=0 ;j<c2 ;j++){
                for(int k=0 ;k<c ;k++){
                
                    sum[i][j] = sum[i][j] + array1[i][k]*array2[k][j];

                }

            }
        }
            System.out.println("multipication of array1 and array2 ");
            
            for(int i=0 ; i<r; i++){
                for(int j=0 ; j<c2 ; j++){
    
                    System.out.print(sum[i][j]+" ");
    
                }
                 System.out.println("");
            }

    }

}

