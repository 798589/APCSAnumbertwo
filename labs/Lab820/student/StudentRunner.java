
/**
 * Class Student Runner
 * 
 * @author (MartheRenard) 
 * @version (820)
 */
public class StudentRunner
{
    public static void main(){
    String[] names = {"Marthe", "Dylan", "Cameron", "Edward", "Guy"};
    int[] studId = {555555, 444444, 333333, 222222, 111111};
    Student[] students = new Student[5];
    for(int i=0; i<5; i++){
        Student si = new Student();
        students[i] = si;
        students[i].setStudentName(names[i]);
        students[i].setStudentID(studId[i]);
    }
    for(int i=0; i<5; i++){
        System.out.println(students[i].getStudentName() + ", " +
            students[i].getStudentID());
    }
}
}

    