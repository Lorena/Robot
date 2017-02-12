import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lorena on 12/02/17.
 */
public class CommandTest {

    public Command command;

    @Test
    public void shouldTurnLeft(){
        Robot robot = new Robot();
        robot.setDirection("E");
        command = new Command();
        command.executeCommands(robot, "L", null);
        assertEquals(robot.getDirection(), "N");
    }

    @Test
    public void shouldTurnRight(){
        Robot robot = new Robot();
        robot.setDirection("E");
        command = new Command();
        command.executeCommands(robot, "R", null);
        assertEquals(robot.getDirection(), "S");
    }

    @Test
    public void shouldMoveOn(){
        Robot robot = new Robot();
        robot.setDirection("E");
        robot.setPositionX(1);
        command = new Command();
        command.executeCommands(robot, "M", null);
        assertEquals(robot.getPositionX(),  2);
    }
}