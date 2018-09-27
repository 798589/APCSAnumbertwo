
/**
 * Write a description of class BallRunner here.
 *
 * @author (MartheRenard)
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
                free= i;
            }
        }
        return free;

    }  

    public static void activity2()
    {
        BallWorld ballWorld = new BallWorld(750,750);
        TGPoint tgpoint = new TGPoint((int)(Math.random())*100+1, (int)(Math.random())*1);
        BallBot[] ballArray = new BallBot[10];
        BallRunner ballRunner = new BallRunner();
        while(true){
            for(int i = 0; i<ballArray.length; i++){
                int x = (int)(Math.random()*12+1);
                if(ballRunner.findFreeBallBotIndex(ballArray)>=0){
                    BallBot ballBot = new BallBot(ballWorld, tgpoint, Math.random()*360, x);
                    ballArray[i] = ballBot;
                }
                if(ballArray[i]!=null){
                    if(ballArray[i].canMoveForward(ballWorld)==true){
                        ballArray[i].moveForward();
                    }else{
                        ballArray[i].setHeading(ballArray[i].getHeading()+ 90);
                    }
                }
            }
        }
    }

    public double distanceBetweenPoints(TGPoint point1, TGPoint point2){
        return Math.sqrt((Math.pow(point1.x-point2.x,2)+(Math.pow(point1.y-point2.y,2))));

    }

    public boolean entranceClear(BallBot[]ballBotArray,TGPoint entrancePoint){
    }
}
