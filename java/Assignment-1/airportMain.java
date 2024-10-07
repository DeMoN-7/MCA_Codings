import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

class Flight {

    // private attributes
    private static int flightNumberCounter = 1000;
    private int flightNumber;
    private String destination;
    private LocalTime departureTime;
    private LocalTime ArrivalTime;

    // Constructor to assign values
    Flight(String destination, LocalTime depart, LocalTime arrival) {
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
    public boolean isComplete(){
        return ArrivalTime.isBefore(LocalTime.now());
        // this method return true if arrival time is less than current time
    }
    public int getFlightNumber(){
        return flightNumber; 
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
        System.out.println("Flight Number" + this.flightNumber);
        System.out.println("Flight Destination" + this.destination);
        System.out.println("Flight Departure time" + this.departureTime);
        System.out.println("Flight Arrival time" + this.ArrivalTime);
    }

}

class airport {
    // private attributes
    private String name;
    private List<Flight> flights;

    // Constructor to get value
    airport(String name){
        this.name=name;
        this.flights=new ArrayList<>();
    }

    // private methods
    private Flight findFlightByNumber(int flightNumber){
        for(Flight flight:flights){
            if(flight.getFlightNumber()==flightNumber){
                return flight;
            }
        }
        return null;
    }



    // public methods
    public void addFlight(Flight flight) {
        flights.add(flight);
        // adds flight object to array list or add flight to airport
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
