import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person passenger;
    private Bus bus;

    @Before
    public void before() {
        busStop = new BusStop("Elm Row");
        passenger = new Person();
        bus = new Bus("Portobello", 20);
    }

    @Test
    public void hasName(){
        assertEquals("Elm Row", busStop.getName());
    }

    @Test
    public void queueIsEmpty() {
        assertEquals(0, busStop.queueCount());
    }

    @Test
    public void canAddPersonToQueue(){
      busStop.addPersonToQueue(passenger);
      assertEquals(1, busStop.queueCount());
    }

    @Test
    public void canRemovePersonFromQueue(){
      busStop.addPersonToQueue(passenger);
      busStop.removeFromQueue();
      assertEquals(0, busStop.queueCount());
    }

}
