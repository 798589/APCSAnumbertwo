
/**
 * Lab 906::Find Mean Median and Mode
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StatRunner{
    /**
 * Write a description of class StudentRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentRunner extends StatTester{
    public static void main(){

        String[] names = {"Marthe", "Dylan", "Ayden", "Edward", "Cameron"};
        int[] studId = {555555, 444444, 333333, 222222, 111111};
        StatTester[] students = new StatTester[5];
        for(int i=0; i<5; i++){
            StatTester si = new StatTester();
            students[i] = si;
            students[i].setStatTesterName(names[i]);
            students[i].setStatTesterID(studId[i]);
        }
        for(int i=0; i<5; i++){
            System.out.println(students[i].getStatTestertName() + ", " +
                students[i].getStatTesterID());
            }

    }
}

    
    public static void main(){
        StatTester st = new StatTester();
        st.loadArray();
        st.printArray();
    }
}
