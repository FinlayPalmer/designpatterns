import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * Creates a new Flight
 * 
 * @author Finlay Palmer
 */
public class Flight {
    private String flightNum;
    private Airport from;
    private Airport to;
    private LocalTime startTime;
    private LocalTime endTime;
    private int numTransfers;

    /**
     * Creates a new Flight
     * 
     * @param flightNum    Flight Number
     * @param from         Origin Airport
     * @param to           Destination Airport
     * @param startTime    Origin Time
     * @param endTime      Destination Time
     * @param numTransfers Number of Transfers
     */
    public Flight(String flightNum, Airport from, Airport to, LocalTime startTime, LocalTime endTime,
            int numTransfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.startTime = startTime;
        this.endTime = endTime;
        this.numTransfers = numTransfers;

    }

    /**
     * Gets the origin airport
     * 
     * @return Origin Airport
     */
    public Airport getFrom() {
        return from;
    }

    /**
     * Gets the destination airport
     * 
     * @return Destination Airport
     */
    public Airport getTo() {
        return to;
    }

    /**
     * Returns if the origin and destination airport are the same
     * 
     * @param from Origin Airport
     * @param to   Destination Airport
     * @return True if the origin and destination airport are the same
     */
    public boolean sameLoc(Airport from, Airport to) {
        return from.toString().equals(to.toString());
    }

    /**
     * Returns a string representing all available flights
     * 
     * @return A string representing all available flights
     */
    public String toString() {
        String typeLayover = "Direct Flight";
        if (numTransfers == 1) {
            typeLayover = "1 Stopover";
        } else if (numTransfers > 1) {
            typeLayover = numTransfers + " Transfers";
        }
        return from.toString() + " to " + to.toString() + " " + startTime.toString() + " - " + endTime.toString() + " ("
                + startTime.until(endTime, ChronoUnit.HOURS) + "h " + startTime.until(endTime, ChronoUnit.MINUTES) % 60
                + "m) " + typeLayover;
    }
}
