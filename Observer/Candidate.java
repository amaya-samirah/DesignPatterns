/**
 * Holds the information for the candidate
 * @author Amaya Shabazz
 */
public class Candidate {
    
    //instance variables
    public static int totalNumVotes;
    private String firstName;
    private String lastName;
    private int numFirstPlaceVotes;
    private int numSecondPlaceVotes;
    private int numThirdPlaceVotes;

    /**
     * Creates an instance of a candidate
     * @param firstName Holds the first name of the candidate
     * @param lastName Holds the last name of the candidate
     */
    public Candidate(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Tests if two candidates have the same name
     * @param firstName Holds the candidate's first name
     * @param lastName Holds the candidate's last name
     * @return Will return true two candidates have the same first and last name 
     */
    public boolean equals(String firstName, String lastName)
    {
        return this.firstName.equalsIgnoreCase(firstName) && this.lastName.equalsIgnoreCase(lastName);
    }

    /**
     * Adds one vote to the toal number of votes
     */
    public static void addVote()
    {
        //unsure about this
        totalNumVotes+=1;

    }
    /**
     * Adds one vote to the toal number of first place votes
     */
    public void addFirstPlaceVote()
    {
        numFirstPlaceVotes+=1;
    }
    /**
     * Adds one vote to the toal number of second place votes
     */
    public void addSecondPlaceVote()
    {
        numSecondPlaceVotes+=1;
    }
    /**
     * Adds one vote to the total number of third place votes
     */
    public void addThirdPlaceVotes()
    {
        numThirdPlaceVotes+=1;
    }
    /**
     * Adds weights to the first, second, and third place votes
     * Weight first place with 60%, second place with 30%, and third place with 10%
     * @return Will return the total number of votes after first, second, and third have been weighted
     */
    public double getWeightedVotes()
    {

    }



}
