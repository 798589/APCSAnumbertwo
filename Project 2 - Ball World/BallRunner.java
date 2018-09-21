
/**
 * Write a description of class BallRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BallRunner
{

    public static void activity1(){
        BallWorld ballWorld = new BallWorld(250,250);
        TGPoint tgpoint = new TGPoint(0,0);
        BallBot ballBot = new BallBot(ballWorld, tgpoint, 0, 10);

        while(true){
            if(ballBot.canMoveForward(ballWorld)== true){
                ballBot.moveForward();
            }else{
                ballBot.setHeading(ballBot.getHeading()+90);
       
            }
        }
    }
    
   public int findFreeBallBotIndex(BallBot[]ballBotArray){
       int free= ballBotArray.length;
       for(int i=0; i<ballBotArray.length; i++){
           if(ballBotArray[i]==null){
               free= 1;
            }
        }
        return free;
        
    }  
}
