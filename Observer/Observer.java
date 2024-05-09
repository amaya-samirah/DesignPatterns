/**
 * Holds the methods for the Observer
 * @author Amaya Shabazz
 */
import java.util.ArrayList;
public interface Observer {

    /**
     * Updates the observer on the subject
     * @param candidates Holds the candidate information
     */
    public void update(ArrayList<Candidate> candidates);
    
}
