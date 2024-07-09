
import java.util.Scanner;

class student{
    double Enrollment_No;
    String Name;
    int Semester;
    float CPI;

    void student(double Enrollment_No,String Name,int Semester,float CPI){

        this.Enrollment_No = Enrollment_No;
        this.Name = Name;
        this.Semester = Semester;
        this.CPI = CPI;
    }

    void displayStuentsDetail(){
        System.out.println("Enrollment_No :"+Enrollment_No);
        System.out.println("Name :"+Name);
        System.out.println("Semester :"+Semester);
        System.out.println("CPI :"+CPI);
    }
}
public class StudentDetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double Enrollment_No;
        String Name;
        int Semester;
        float CPI;

        System.out.print("Enter a no. of Students :");
        int n = sc.nextInt();

        student[] student = new student[n];
        for(int i=0 ; i<n ; i++){
            
            System.out.print("Enter student Enrollment_No :");
            student[i].Enrollment_No = sc.nextDouble();

            System.out.print("Enter student Name :");
            student[i].Name = sc.next();
            
            System.out.print("Enter student Semester :");
            student[i].Semester = sc.nextInt();
            
            System.out.print("Enter student CPI :");
            student[i].CPI = sc.nextFloat();

        }

        for(int i=0; i<n ; i++){
            student[i].displayStuentsDetail();
        }
    }
}










