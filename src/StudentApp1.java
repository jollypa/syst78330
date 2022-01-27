
import java.util.Scanner;


//PARUL JOLLY

public class StudentApp1 {
  
    public static void main(String[] args) throws Exception{ 
            
        Student[] students= new Student[3];
        students[0] = new Student(100,"MIke",60);       
        students[1] = new Student(200,"Joe",96);
        students[2] = new Student(300,"Linda",33);
        System.out.println("Please Enter Student ID for Displaying Info:");
        Scanner abc = new Scanner(System.in);
        int inID = abc.nextInt();
        for(int i=0;i<students.length;i++){
            if(students[i].getId()==inID){
                System.out.println(students[i].toString()
                );
            }
        }
        
        
        
        
    }
}
    

