import java.util.Iterator;
import java.util.ArrayList;

/**
 * Creates a new FlightIterator
 * 
 * @author Finlay Palmer
 */
public class FlightIterator implements Iterator {
    private ArrayList<Flight> flights;
    private int position;
    private Airport to;
    private Airport from;

    /**
     * Creates a new FlightIterator
     * 
     * @param flights Arraylist of all available flights
     * @param from    Origin Airport
     * @param to      Destination Airport
     */
    public FlightIterator(ArrayList<Flight> flights, Airport from, Airport to) {
        this.flights = new ArrayList<Flight>();
        for (int x = 0; x < flights.size(); x++) {
            this.flights.add(x, flights.get(x));
        }
        this.from = from;
        this.to = to;
    }

    /**
     * Returns if flights has another Flight
     * 
     * @return True if flights has another Flight
     */
    public boolean hasNext() {
        return (position < flights.size());
    }

    /**
     * Returns the next Flight in flights
     * 
     * @return The next Flight in flights
     */
    public Flight next() {
        return flights.get(position++);
    }
}