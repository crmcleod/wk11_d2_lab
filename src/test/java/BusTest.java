import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person passenger;
    private BusStop busStop;

    @Before
    public void before() {
        bus = new Bus("Ocean Terminal", 15);
        passenger = new Person();
        busStop = new BusStop("Elm Row");
        busStop.addPersonToQueue(passenger);
    }
    @Test
    public void busHasDestination(){
        assertEquals("Ocean Terminal", bus.getDestination());
    }

    @Test
    public void busStartsEmpty() {
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassenger(){
        bus.pickUp(busStop);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canRemovePassenger(){
      bus.pickUp(busStop);
      bus.removePassenger();
      assertEquals(0, bus.passengerCount());
    }

}


