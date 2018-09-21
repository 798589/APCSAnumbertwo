
/**
 * Write a description of class Student here.
 * 
 * @author (MartheRenard) 
 * @version (912)
 */
public class Student
{
     /* Instance variables of class Student
     */
    private int studentID;
    private boolean studentActive;
    private double studentGPA;
    private String studentName;

    
     public int getStudentID(){
        return studentID;
    }
    
    public boolean getStudentActive(){
        return studentActive;
    }
    
    public double getStudentGPA(){
        return studentGPA;
    }
    
    public String getStudentName(){
        return studentName;
    }
    
    
    
    public void setStudentID(int paramStudentID){
        studentID = paramStudentID;
    }
    
    public void setStudentActive(boolean paramStudentActive){
        studentActive = paramStudentActive;
    }
    
    public void setStudentGPA(double paramStudentGPA){
        studentGPA = paramStudentGPA;
    }
    public void setStudentName(String paramStudentName){
        studentName = paramStudentName;
    }
}