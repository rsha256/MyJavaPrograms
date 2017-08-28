public class Robots
{
    public static void main( String [] args )
    {
        Robot roboName = new Robot( "Robo" );
        BetterRobot theta = new BetterRobot( "Buster" , "XYZ123" );
        
        roboName.display();
        theta.display();
    }
}
