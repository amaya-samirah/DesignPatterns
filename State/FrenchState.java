/**
 * Holds the french state
 * @author Amaya Shabazz
 */
public class FrenchState extends State{
    private static String TWINKLE_FILE_NAME = "State/twinkle-french.txt";
    private static String HAPPY_FILE_NAME = "State/happy-french.txt";

    public FrenchState(MusicBox box)
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
        s("Changing English mode...");
    }

    /**
     * Changes to french state
     */
    @Override
    public void pressFrenchButton()
    {
        s("Already in French mode...");
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
