package Assignment1;

public class robot {
    
    private enum State{
        INIT, AUTO, TELEOP
    }
    public static void main(String[] args) {
        State state = State.INIT;
        while(true){
        teleop.teleopInit();
        teleop.teleopPeriodic();
        }
        // switch(state){
        //     case INIT:
        //         //call robot init
        //         robotInit();
        //         state = State.AUTO;
        //         break;
        //     case AUTO:
        //         //call auto init
        //         autonomous.autonomousInit();
        //         //call auto
        //         //autonomous.autonomousPeriodic();
        //         state = State.TELEOP;
        //         break;
            
        //     case TELEOP:
        //         //call tele init
        //         teleop.teleopInit();
        //         //call teleop 
        //         teleop.teleopPeriodic();
        //         break;
        //     default:
        //         System.out.println("In Defualt Case, Something Went Wrong.");
        //         break;

        // }
    
        
       
        
    }

    public static void robotInit(){



    }

}
