/**
 * Holds the information for the percentage display
 * @author Amaya Shabazz
 */
import java.util.ArrayList;
public class PercentageDisplay implements Observer {

    private Subject poll;
    private ArrayList<Candidate> candidates;

    public PercentageDisplay(Subject poll)
    {
        this.poll = poll;
    }
}
