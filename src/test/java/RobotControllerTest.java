import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class RobotControllerTest {

    public RobotController robotController;

    @Mock
    public Robot robot;

    @Mock
    public Command command;

    @Test
    public void shouldDiscoveredFinalPoint() {

        robotController = new RobotController(robot, command);
        when(robot.getPositionX()).thenReturn(1);
        when(robot.getPositionY()).thenReturn(2);
        Robot robot = robotController.discoveredFinalPoint("12N", "LMLMLMLMM");

        verify(robot, times(1)).buildRobot("12N");
        verify(command, times(1)).executeCommands(robot, "LMLMLMLMM", "55");
        assertEquals(robot.getPositionX(), 1);
        assertEquals(robot.getPositionY(), 2);
    }

}