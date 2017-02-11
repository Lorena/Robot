import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AppTest {

    @Mock
    RobotController robotController;

    @Before
    public void setUp() throws Exception {

        robotController = new RobotController();
    }

    @Test
    public void shouldDiscoveredFinalPoint(){
        when(robotController.discoveredFinalPoint()).thenReturn(int[5,5]);
        int[] finalPoint = robotController.discoveredFinalPoint();

        assertEquals(finalPoint[0], 5);
        assertEquals(finalPoint[1], 5);
    }

}