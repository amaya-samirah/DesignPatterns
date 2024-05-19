/**
 * Holds the information for each state
 * @author Amaya Shabazz
 */
import java.util.ArrayList;
public abstract class State {
    protected MusicBox box;
    private ArrayList<String> starLyrics;
    private ArrayList<String> happyLyrics;

    /**
     * This creates a new instance of state
     * @param box Holds the music box infromation
     * @param twinkleFileName Holds the file name for twinkle twinkle little star
     * @param happFileName Holds the file name for happy and you know it
     */
    public State(MusicBox box, String twinkleFileName, String happFileName)
    {
        this.box = box;
        this.starLyrics = FileReader.getLyrics(twinkleFileName);
        this.happyLyrics = FileReader.getLyrics(happFileName);
    }

    /**
     * Starts the music box
     */
    public void pressStartButton()
    {
        
        
    }

    /**
     * Starts the happy state
     */
    public void pressHappyButton()
    {

    }

    /**
     * Starts the English state
     */
    public void pressEnglishButton()
    {

    }

    /**
     * Starts the French state
     */
    public void pressFrenchButton()
    {

    }

    /**
     * Starts the Spansih state
     */
    public void pressSpanishButton()
    {

    }
}
