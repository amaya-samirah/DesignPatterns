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
}
