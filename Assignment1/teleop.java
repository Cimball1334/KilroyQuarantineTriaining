package Assignment1;

import java.time.Clock;

public class teleop {
    static Clock clockOne;

    public static boolean teleopInit() {
        clockOne = Clock.systemDefaultZone();
        return true;
    }

    public enum Combinations{
        NONE,BOTH, FIRST, LAST
    }
    
    static Combinations combos = Combinations.BOTH;

    public static void teleopPeriodic() {
        
        switch (combos) {
            case BOTH:
            countOne();
            countTwo();
                break;
            case FIRST:
            countOne();
                break;
            case LAST:
            countTwo();
                break;
            case NONE:

                break;
            default:
            System.out.println("Halt, THOU SHAL NOT BE HERE");
                break;
        
    }
           

    }
    public static int countOne = 1;
    public static int countTwo = 1;
    public static void countOne(){
        //clock one

        
        //System.out.println("clock count one");
        while(countOne %50 !=0){
        if(System.currentTimeMillis() % 1000 == 0){
            System.out.println(countOne);
            countOne++;
            } 
        }countOne++;
    }
    public static void countTwo(){
        //clock two
        System.out.println("Clock Count Two");
            if(System.currentTimeMillis()%1000 == 500){
                System.out.println(countTwo);
                countTwo++;
             
            }
        
    }    

}
