
import java.util.Iterator;
import java.util.ArrayList;

public class FlightIterator implements Iterator {
    private ArrayList<Flight> flights;
    private int position;
    private Airport to;
    private Airport from;

    public FlightIterator(ArrayList<Flight> flights, Airport from, Airport to) {
        this.flights = new ArrayList<Flight>();
        for (int x = 0; x < flights.size(); x++) {
            this.flights.add(x, flights.get(x));
        }
        this.from = from;
        this.to = to;
    }

    public boolean hasNext() {
        return (position < flights.size());
    }

    public Flight next() {
        return flights.get(position++);
    }
}