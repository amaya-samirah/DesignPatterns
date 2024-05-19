/**
 * Holds the information for the English state
 * @author Amaya Shabazz
 */
public class EnglishState extends State{
    
    private static String TWINKLE_FILE_NAME = "State/twinkle-english.txt";
    private static String HAPPY_FILE_NAME = "State/happy-english.txt";

    /**
     * Constructs a new english state
     * @param box Holds the information from the music box
     */
    public EnglishState(MusicBox box)
    {

        super(box, TWINKLE_FILE_NAME, HAPPY_FILE_NAME);
        this.box = box;
    }

     /**
     * Starts the English state
     */
    @Override
    public void pressEnglishButton()
    {
        s("Already in English mode...");
    }

    /**
     * Changes to french state
     */
    @Override
    public void pressFrenchButton()
    {
        s("Changing to French mode...");
    }

    /**
     * Changes to spanish state
     */
    @Override
    public void pressSpanishButton()
    {
        s("Changing to Spanish mode...");
    }

    /**
     * Prints out to console
     * @param string Holds the string to print
     */
    private void s(String string)
    {
        System.out.println(string);

    }
}
