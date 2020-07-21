import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name){
        this.name = name;
        this.queue = new ArrayList<Person>();
    }

    public int queueCount(){
      return this.queue.size();
    }

    public String getName(){
      return this.name;
    }

    public void addPersonToQueue(Person passenger) {
        this.queue.add(passenger);
    }

    public Person removeFromQueue(){
        return this.queue.remove(0);
    }

}
