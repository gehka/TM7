import java.util.Comparator;

public class EventComparator implements Comparator<Event> {
    @Override
    public int compare(Event t1, Event t2) {
        if (t1.getEventTimestamp() < t2.getEventTimestamp())
            return -1;
        return 1;
    }
}
