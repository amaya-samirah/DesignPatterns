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
    }
    /**
     * Updates the list of candidates
     * @param candidates Holds the information of the candidates
     */
    public void update(ArrayList<Candidate> candidates)
    {
        this.candidates = candidates;
    }
    /**
     * Prints the number of candidates in the list to the console
     */

    private void display()
    {
        int tally =0;
        for(int index = 0;index<candidates.size()-1;index++)
        {
            tally+=1;
        }
        System.out.println(tally);
    }
}
