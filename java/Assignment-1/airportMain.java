import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

class airport{
    // private attributes
    private String name;
    private List<flight>flights =new ArrayList<>();
    // private methods
    private boolean findFlight(int flightNumber){
        return false;
    }
    // public methods
    public void addFlight(){

    }
    public void removeFlight(int flightNumber){

    }
    public List<flight>upcomingFlights(){

    }
    public List<flight>CompletedFlights(){
        
    }
    public void displayDetails(){

    }

    
}
class flight{
    // private attributes
    private int flightNumber;
    private String destination;
    private LocalTime departureTime;
    private LocalTime ArrivalTime;

}
public class airportMain {
    public static void main(String[] args) {
        
    }
}
