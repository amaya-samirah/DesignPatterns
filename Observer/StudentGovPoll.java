/**
 * Holds the information regarding to the student government poll
 * @author Amaya Shabazz
 */
import  java.util.ArrayList;
public class StudentGovPoll implements Subject{

    private ArrayList<Observer> observers;
    private ArrayList<Candidate> candidates;
    private String school;

    /**
     * Allows to create instanve of StudentGovPoll
     * @param school Holds the name of the school
     */
    public StudentGovPoll(String school)
    {
        this.school = school;
    }
    /**
     * Will register an observer
     * @param observer Holds the information for the observer
     */
    public void registerObserver(Observer observer)
    {
        observers.add(observer);

    }
    /**
     * Will remove an observer
     * @param observer Holds the information for the observer
     */
    public void removeObserver(Observer observer)
    {
        // for(int index=0;index<observers.size();index++)
        // {

        // }
        int index = 0;
        while(!observers.get(index).equals(observer))
        {
            index+=1;
        }
        observers.remove(index);
    }
    /**
     * Notifies the observer
     */
    public void notifyObserver()
    {


    }
    /**
     * Adds a candidate to the list of candidates
     * @param firstName Holds the canidate's first name
     * @param lastName Holds the candidate's last name
     */
    public void addCandidate(String firstName, String lastName)
    {
        Candidate temp = new Candidate(firstName, lastName);
        candidates.add(temp);
    }
    /**
     * Enters the number of first, second, and third place votes
     * @param firstPlace Holds the number of first place votes
     * @param secondPlace Holds the number of second place votes
     * @param thirdPlace Holds the number of third place votes
     */
    public void enterVotes(int firstPlace, int secondPlace, int thirdPlace)
    {
        

    }
    /**
     * Accesses the name of the school
     * @return Will return the name of the school
     */
    public String getSchool()
    {
        return this.school;
    }

    
}
