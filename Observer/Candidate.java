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
        
        totalNumVotes+=1;

    }
    /**
     * Adds one vote to the toal number of first place votes
     */
    public void addFirstPlaceVotes()
    {
        numFirstPlaceVotes+=1;
    }
    /**
     * Adds one vote to the toal number of second place votes
     */
    public void addSecondPlaceVotes()
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
     * @return Will return the weighted average number of votes
     */
    public double getWeightedVotes()
    {
        double weightedAverage = 0.0;

        double weightedFirstPlaceVotes = 0.6*numFirstPlaceVotes;
        double weightedSecondPlaceVotes = 0.3*numSecondPlaceVotes;
        double weightedThirdPlaceVotes = 0.1*numThirdPlaceVotes;

        double sumOfWeightedVotes = weightedFirstPlaceVotes+weightedSecondPlaceVotes+weightedThirdPlaceVotes;
        weightedAverage = sumOfWeightedVotes/3;

        return weightedAverage;

    }
    /**
     * Accesses the candidate's first and last name
     * @return Will return the candidates first and last name
     */
    public String getFullName()
    {
        return this.firstName+" "+this.lastName;

    }
    /**
     * Accesses the total number of first place votes
     * @return Will return the number of first place votes
     */
    public int getNumFirstPlaceVotes()
    {
        return this.numFirstPlaceVotes;

    }
    /**
     * Accesses total number of second place votes
     * @return Will return the number of second place votes
     */
    public int getNumSecondPlaceVotes()
    {
        return this.numSecondPlaceVotes;
    }
    /**
     * Accesses the total number of third place votes
     * @return Will return the number of third place votes
     */
    public int getNumThirdPlaceVotes()
    {
        return this.numThirdPlaceVotes;
    }




}
