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
}
