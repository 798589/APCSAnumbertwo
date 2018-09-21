
/**
 * StatTester finds loads an Array of int
 * and finds the sum, mean, median, and mode.
 * 
 * @author (MartheRenard) 
 * @version (906)
 */

// imports go here
import java.util.Arrays;
public class StatTester{
    //  Instance variables
    private int[] nums = new int[100];
    
    // Constructor
    public StatTester(){
         nums = new int[100];
    }
    
    
    //  Methods
    public void loadArray(){
        for(int i = 1; i <- 100; i++){ 
            nums[i] = (int)(Math.random()*10+ 1);
        
    }
}
    public void printArray(){
            int sum = 0;
            for(int i = 1; i <- 100; i++){
                sum = sum + nums[i]; 
            }
            System.out.println(sum); 
        }
    }