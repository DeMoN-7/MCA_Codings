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
    boolean upcomingFlight() {
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
        System.out.println("Flight Number " + this.flightNumber);
        System.out.println("Flight Destination " + this.destination);
        System.out.println("Flight Departure time " + this.departureTime);
        System.out.println("Flight Arrival time " + this.ArrivalTime);
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
        Flight flight=findFlightByNumber(flightNumber);
        if (flight!=null) {
            flights.remove(flightNumber);
            System.out.println("Flight Number: "+flightNumber+" removed");
        }
        else{
            System.out.println("Flight Not Found");
        }

    }

    public List<Flight> upcomingFlights() {
        List<Flight>upcomingFlights=new ArrayList<>();
        for(Flight flight:flights){
            if(flight.upcomingFlight()){
                upcomingFlights.add(flight);
            }
        }
        return upcomingFlights;
    }

    public List<Flight> CompletedFlights() {
        List<Flight>completedFlights=new ArrayList<>();
        for(Flight flight:flights){
            if(flight.isComplete()){
                completedFlights.add(flight);
            }
        }
        return completedFlights;
    }

    public void displayDetails() {
        System.out.println("All flights at "+name+": ");
        for(Flight flight:flights){
            flight.display();
        }
    }

}

public class airportMain {
    public static void main(String[] args) {

        // Creating object for Airport
        airport airport=new airport("Demonic Ports");

        // Creating object for flights
        Flight flight1 = new Flight("New York", LocalTime.of(14, 30), LocalTime.of(18, 30));
        Flight flight2 = new Flight("London", LocalTime.of(15, 0), LocalTime.of(20, 0));
        Flight flight3 = new Flight("Paris", LocalTime.of(10, 0), LocalTime.of(12, 0));

        // adding flights to airport
        airport.addFlight(flight1);
        airport.addFlight(flight2);
        airport.addFlight(flight3);

        // displaying all flight which are at airport
        airport.displayDetails();

        // updating arrival time of flight 1
        flight1.updateArrival(LocalTime.of(16, 10));
        System.out.println("\nAfter updating arrival time \n");
        airport.displayDetails();


    }
}
