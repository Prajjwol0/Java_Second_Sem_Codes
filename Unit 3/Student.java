// Create a Java class called Student with attributes for studentId, name, and grades. 
// Write a method to calculate and return the average grade.
import java.util.Scanner;
public class Student {
    public int studentId;
    public String name;
    private double[] grade;

double sum;

    Scanner input = new Scanner(System.in);


    // Constructor
    Student(int studentId, String name, double[] grade,double sum) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
        this.sum=sum;
    }

    // setter to set data

    public void setGrade(double[] grade1){
        grade=grade1;
    }

    //getter to get data
    public double[] getGrade(){
        return grade;
    }

    // Private method

    private double calculateGrade(){
        for (int i=0;i<5;i++){
            grade[i]=input.nextDouble();

            double sum=grade[i]+sum;
        }
       
    }

}
