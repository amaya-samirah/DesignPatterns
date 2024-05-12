/**
 * Holds the information for the percentage display
 * @author Amaya Shabazz
 */
import java.util.ArrayList;
public class PercentageDisplay implements Observer {

    private Subject poll;
    private ArrayList<Candidate> candidates;

    /**
     * Creates a new instance of PercentageDisplay
     * @param poll Holds the information of poll
     */
    public PercentageDisplay(Subject poll)
    {
        this.poll = poll;
    }
    /**
     * Sets the list of candidates to the input list
     * @param candidates Holds the information of the list of candidates
     */
    public void update(ArrayList<Candidate> candidates)
    {
        this.candidates = candidates;
    }
    /**
     * Displays the percentage of votes
     */
    private void display()
    {

    }
}
