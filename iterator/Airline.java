
import java.util.ArrayList;

public class Airline {
    private String title;
    private ArrayList<Flight> flights;

    public Airline(String title) {
        flights = new ArrayList<Flight>();
        flights = FlightLoader.getFlights();
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public FlightIterator createIterator(String fromCode, String toCode) {
        ArrayList<Flight> codeFlights = new ArrayList<Flight>();
        for (int i = 0; i < flights.size(); i++) {
            if (flights.get(i).getFrom().equals(Airport.valueOf(fromCode))
                    && flights.get(i).getTo().equals(Airport.valueOf(toCode))) {
                codeFlights.add(flights.get(i));
            }

        }
        return new FlightIterator(codeFlights, Airport.valueOf(fromCode), Airport.valueOf(toCode));
    }

}
