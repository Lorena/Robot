
public class App {

    public static void main(String[] args) {

        RobotController robotController = new RobotController();
        int[] finalPoint = robotController.discoveredFinalPoint();
        System.out.println(finalPoint[0]);
        System.out.println(finalPoint[1]);

    }
}
