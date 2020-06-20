
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class main
{
    public static void main(String[] args){
                
        System.out.println("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];
        
        for (int n = 0; n < numOfStudents; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuiton();
            
        }
        for (int n = 0; n < numOfStudents; n++){
            System.out.println(students[n].toString());
            System.out.print("\n");
        }
    }
}
