import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

class flight {

    // private attributes
    private static int flightNumberCounter = 1000;
    private int flightNumber;
    private String destination;
    private LocalTime departureTime;
    private LocalTime ArrivalTime;

    // Constructor to assign values
    flight(String destination, LocalTime depart, LocalTime arrival) {
        this.ArrivalTime = arrival;
        this.departureTime = depart;
        this.destination = destination;
        this.flightNumber = ++flightNumberCounter;
    }

    // private methods
    private boolean upcomingFlight() {
        return departureTime.isAfter(LocalTime.now());
        // this function return true if departure time is more than current time

    }

    // public method
    public void updateDeparture(LocalTime newDepart) {
        // updated departure time only get updated whn it is called
        this.departureTime = newDepart;
    }

    public void updateArrival(LocalTime newArrival) {
        // updated arrival time only get updated whn it is called
        this.ArrivalTime = newArrival;
    }

    public void display() {
        // to display details of flight,including flight number,destination and times
        System.out.println("Flight Number"+this.flightNumber);
        System.out.println("Flight Destination"+this.destination);
        System.out.println("Flight Departure time"+this.departureTime);
        System.out.println("Flight Arrival time"+this.ArrivalTime);
    }

}

class airport {
    // private attributes
    private String name;
    private List<flight> flights = new ArrayList<>();

    // private methods
    private boolean findFlight(int flightNumber) {
        return false;
    }

    // public methods
    public void addFlight() {

    }

    public void removeFlight(int flightNumber) {

    }

    public List<flight> upcomingFlights() {

    }

    public List<flight> CompletedFlights() {

    }

    public void displayDetails() {

    }

}

public class airportMain {
    public static void main(String[] args) {

    }
}
