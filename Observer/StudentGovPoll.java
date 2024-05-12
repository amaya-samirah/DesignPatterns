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
    @Override
    public void registerObserver(Observer observer)
    {
        observers.add(observer);
    }
    /**
     * Will remove an observer
     * @param observer Holds the information for the observer
     */
    @Override
    public void removeObserver(Observer observer)
    {
        // // for(int index=0;index<observers.size();index++)
        // // {

        // // }
        // int index = 0;
        // while(!observers.get(index).equals(observer))
        // {
        //     index+=1;
        // }
        observers.remove(observer);
    }
    /**
     * Notifies the observer
     */
    @Override
    public void notifyObserver()
    {
        for(int index=0;index<observers.size();index++)
        {
            observers.get(index).update(candidates);
        }
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
        for(int index = 0;index<candidates.size();index++)
        {
            for(int firstPlaceNum=0;firstPlaceNum<firstPlace+1;firstPlaceNum++)
            {
                candidates.get(index).addFirstPlaceVotes();
            }
            for(int secondPlaceNum=0;secondPlaceNum<secondPlace+1;secondPlaceNum++)
            {
                candidates.get(index).addSecondPlaceVotes();
            }
            for(int thirdPlaceNum=0;thirdPlaceNum<thirdPlace+1;thirdPlaceNum++)
            {
                candidates.get(index).addThirdPlaceVotes();
            }
        }

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
