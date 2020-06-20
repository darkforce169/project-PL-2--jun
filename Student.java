 
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class Student
{
    
    //instance vars
    private String firstName;
    private String lastName;
    private int studentyear;
    private String studentID;
    private String courses = "";
    private int tuitonfee = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;
    
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();
        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();
        System.out.print("Enter student year(1, 2, 3, 4): ");
        this.studentyear = in.nextInt();
       
       setStudentID();
       
       //input and create student details
      
       
    }
    private void setStudentID(){//generating student id
       this.studentID = studentyear + "" + id;
       id++;
    }
    public void enroll(){//taking inputs for student's course
      do{
        System.out.println("Enter course to enroll(Enter q to quit.): ");
        Scanner in = new Scanner(System.in);
        String course = in.nextLine();
        if(!course.equals("q")){
            courses = courses + " " + course;
            tuitonfee = tuitonfee + costOfCourse;
         }
       else{
            break;
         }
     }while(1 != 0);
     
    
     }
    public void viewfee(){//output amout of unpaid tuiton fee
        System.out.println("Your unpaid tuiton fee is: $" + tuitonfee);
     }
    
    public void payTuiton(){//shows payment and fee
        viewfee();
        System.out.println("Enter your payment: ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        if(payment <= 0){
            throw new java.lang.RuntimeException("Invalid amount");
        }
        tuitonfee = tuitonfee - payment;
        if(tuitonfee <= 0){
            System.out.println("Your change is: $" + Math.abs(tuitonfee));
        }
        else{
            System.out.println("Thank you for your payment of $"+payment);
            System.out.println("Your unpain tuiton fee is: $" + Math.abs(tuitonfee));
            
        }
        
        
        System.out.println("\n");
     }
    public String toString(){//display student details
        
        if(tuitonfee >= 0){
            return "Name: " + firstName + " " + lastName + "\nStuden ID: " + studentID + "\nCourses Enrolled: " + courses + "\nUnpaid tuiton fee: $" + tuitonfee;
          }
        else{
            return "Name: " + firstName + " " + lastName + "\nStuden ID: " + studentID + "\nCourses Enrolled: " + courses + "\nchange: $" + Math.abs(tuitonfee);
        }
    }
}
   

