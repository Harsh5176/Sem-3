
import java.util.Scanner;

// 34. Create class Employee_Detail with attributes Employee_ID, Name, Designation,
// and Salary. Write a program to read the detail from user and print it. 

// mistake made in this code
// constroctor name same as class name 
// always make an object of class not method's
// to add more more then one Employee make an array of Employee like below
// EmployeeDetail Employee = new EmployeeDetail[n];  


class Employee{
    int Employee_id;
    String Employee_name;
    String  Empployee_Designation;
    int Empolyee_salary;

    Employee(int Employee_id,String Employee_name,String  Empployee_Designation,
    int Empolyee_salary){
        this.Employee_id = Employee_id;
        this.Employee_name = Employee_name;
        this.Empployee_Designation = Empployee_Designation;
        this.Empolyee_salary = Empolyee_salary;
    }
    void displayAccountDetails(){
        System.out.println("Employee's id is :"+Employee_id);
        System.out.println("Employee_name's id is :"+Employee_name);
        System.out.println("Empployee_Designation's id is :"+Empployee_Designation);
        System.out.println("Empolyee_salary's id is :"+Empolyee_salary);
    }
}

public class EmployeeDetail {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

   

    System.out.print("Enter Employee_id :");
    int Employee_id = sc.nextInt();

    System.out.print("Enter Employee_name :");
    String Employee_name = sc.next();

    System.out.print("Enter Employee_Designation :");
    String Empployee_Designation = sc.next();

    System.out.print("Enter Employee_salary :");
    int Empolyee_salary = sc.nextInt();

    Employee B1 = new Employee(Employee_id, Employee_name,Empployee_Designation,Empolyee_salary);
    B1.displayAccountDetails();

    }
}
