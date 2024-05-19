/**
 * Holds the information for the spanish state
 * @author Amaya Shabazz
 */
public class SpanishState extends State{
    private static String TWINKLE_FILE_NAME = "State/twinkle-spanish.txt";
    private static String HAPPY_FILE_NAME = "State/happy-spanish.txt";

    public SpanishState(MusicBox box)
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
        s("In English mode...");
    }

    /**
     * Changes to french state
     */
    @Override
    public void pressFrenchButton()
    {
        s("In French mode...");
        
    }

    /**
     * Changes to spanish state
     */
    @Override
    public void pressSpanishButton()
    {
        s("In Spanish mode...");
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
