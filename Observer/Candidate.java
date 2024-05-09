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

    public static void addVote()
    {

    }


}
