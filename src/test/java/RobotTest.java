import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lorena on 12/02/17.
 */
public class RobotTest {

    Robot robot;

    @Test
    public void shouldBuildRoot(){
        robot = new Robot();

        robot.buildRobot("12N");

        assertEquals(1, robot.getPositionX());
        assertEquals(2, robot.getPositionY());
        assertEquals("N", robot.getDirection());
    }



}