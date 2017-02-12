import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) throws IOException {

        RobotController robotController = new RobotController(new Robot(), new Command());

        System.out.println("> Enter the initial position like a model 12N: ");
        String initialPoints = readFromUser();
        System.out.println("> Enter the commands like a model LMLMLMLMLM");
        String commands = readFromUser();

        Robot robot = robotController.discoveredFinalPoint(initialPoints, commands);
        System.out.println("! This is the final position: ");
        System.out.println(robot.getPositionX() + " " + robot.getPositionY());
        System.out.println(robot.getDirection());

    }

    private static String readFromUser() throws IOException {
        BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
        return in.readLine().replace(" ", "");
    }
}
