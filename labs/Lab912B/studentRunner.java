
/**
 * Write a description of class studentRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class studentRunner
{
       public static void main(){  
        String[] names = {"Marthe", "Dylan","Edward", "Aiden", "Cameron"};
        int[] studId = {555555, 444444, 333333, 222222, 111111} ;
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        Student[] studArray = { s1, s2, s3, s4, s5};
        Student[] students = new Student[5];
    for (int i = 0; i < 5; i++) {
        Student si = new Student ();
        students[i] = si;
        students[i].setStudentname(names[i]);
        students[i].setStudentID(studId[i]);
    }
    for (int i=0; i<5; i++){
        System.out.println(students[i].getStudentName() + "," +
            students[i].getstudentID());
        }
    }
}