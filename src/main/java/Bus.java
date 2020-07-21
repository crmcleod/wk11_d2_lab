import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();

    }

    public String getDestination() {
        return this.destination;
    }

    public int passengerCount(){
      return this.passengers.size();
    }

    public void pickUp(BusStop busStop) {

        if (this.capacity > passengerCount()) {
            Person newPassenger = busStop.removeFromQueue();
            this.passengers.add(newPassenger);
        }

    }

    public void removePassenger() {
        this.passengers.remove(0);
    }
}