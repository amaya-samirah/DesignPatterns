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

    public void notifyObserver()
    {
        

    }

    
}
