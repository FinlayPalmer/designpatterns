import java.util.ArrayList;

/**
 * Creates a new Airline
 * 
 * @author Finlay Palmer
 */
public class Airline {
    private String title;
    private ArrayList<Flight> flights;

    /**
     * Creates a new Airline
     * 
     * @param title The name of the airline
     */
    public Airline(String title) {
        flights = new ArrayList<Flight>();
        flights = FlightLoader.getFlights();
        this.title = title;
    }

    /**
     * Returns the name of the airline
     * 
     * @return The name of the airline
     */
    public String getTitle() {
        return title;
    }

    /**
     * Creates a new FlightIterator from the fromCode and toCode
     * 
     * @param fromCode Origin Airport
     * @param toCode   Destination Airport
     * @return The new FlightIterator
     */
    public FlightIterator createIterator(String fromCode, String toCode) {
        boolean airportExists = false;
        for (Airport airport : Airport.values()) {
            if (airport.toString().equals(fromCode)) {
                airportExists = true;
            }
        }

        if (airportExists) {
            ArrayList<Flight> codeFlights = new ArrayList<Flight>();
            for (int i = 0; i < flights.size(); i++) {
                if (flights.get(i).getFrom().equals(Airport.valueOf(fromCode))
                        && flights.get(i).getTo().equals(Airport.valueOf(toCode))) {
                    codeFlights.add(flights.get(i));
                }

            }
            return new FlightIterator(codeFlights, Airport.valueOf(fromCode), Airport.valueOf(toCode));
        }
        System.out.println("Must enter valid airport codes");
        return null;

    }

}
