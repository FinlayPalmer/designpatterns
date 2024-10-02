
import java.time.LocalTime;

import javafx.util.Duration;

public class Flight {
    private String flightNum;
    private Airport from;
    private Airport to;
    private LocalTime startTime;
    private LocalTime endTime;
    private int numTransfers;

    public Flight(String flightNum, Airport from, Airport to, LocalTime startTime, LocalTime endTime,
            int numTransfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.startTime = startTime;
        this.endTime = endTime;
        this.numTransfers = numTransfers;
    }

    public Airport getFrom() {
        return from;
    }

    public Airport getTo() {
        return to;
    }

    public boolean sameLoc(Airport from, Airport to) {
        return from.toString().equals(to.toString());
    }

    public String toString() {
        return to.toString()+" "+from.toString()+" "+startTime.toString()+" - "+endTime.toString()+" ("+Duration.between(startTime,endTime).toHours().toString+") ";
    }
}
