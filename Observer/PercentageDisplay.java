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
        poll.registerObserver(this);
    }
    /**
     * Sets the list of candidates to the input list
     * @param candidates Holds the information of the list of candidates
     */
    @Override
    public void update(ArrayList<Candidate> candidates)
    {
        this.candidates = candidates;
        display();
    }
    /**
     * Displays the percentage of votes
     */
    private void display()
    {
        for(int index = 0;index<candidates.size();index++)
        {
            System.out.println(candidates.get(index).getFullName()+": "+candidates.get(index).getWeightedVotes());
        }

    }
}
