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

    @Test
    public void shouldDiscoveredFinalPoint() {
        int[] finalPointReturned = new int[2];
        finalPointReturned[0]=5;
        finalPointReturned[1]=5;

        when(robotController.discoveredFinalPoint()).thenReturn(finalPointReturned);
        int[] finalPointExpected = robotController.discoveredFinalPoint();

        assertEquals(finalPointReturned[0], finalPointExpected[0]);
        assertEquals(finalPointReturned[1], finalPointExpected[1]);
    }

}