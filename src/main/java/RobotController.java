public class RobotController {


    Robot robot;
    Command command;

    public RobotController(Robot robot, Command command) {
        this.robot = robot;
        this.command = command;
    }

    public Robot discoveredFinalPoint(String initialPoint, String commands ) {
        robot.buildRobot(initialPoint);
        command.executeCommands(robot, commands, "55");
        return robot;
    }
}
