/**
 * Holds the information for the tally display
 * @author Amaya Shabazz
 */
import java.util.ArrayList;
public class TallyDisplay implements Observer{
    private Subject poll;
    private ArrayList<Candidate> candidates;

    /**
     * Allows to create an instance of TallyDisplay
     * @param poll Holds the Subject
     */
    public TallyDisplay(Subject poll)
    {
        this.poll = poll;
        poll.registerObserver(this);
    }
    /**
     * Updates the list of candidates
     * @param candidates Holds the information of the candidates
     */
    @Override
    public void update(ArrayList<Candidate> candidates)
    {
        this.candidates = candidates;
        display();
    }
    /**
     * Prints the number of candidates in the list to the console
     */
    private void display()
    {
        for(int index = 0;index<candidates.size();index++)
        {
            System.out.println(candidates.get(index).getFullName()+" First Place votes: "+candidates.get(index).getNumFirstPlaceVotes()+" Second Place votes: "+candidates.get(index).getNumSecondPlaceVotes()+" Third Place votes: "+candidates.get(index).getNumThirdPlaceVotes());
        }  
    }
}
