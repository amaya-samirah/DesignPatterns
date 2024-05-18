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
     * @param happFileName Holds the file name for happy birthday
     */
    public State(MusicBox box, String twinkleFileName, String happFileName)
    {
        this.box = box;
        this.starLyrics = FileReader.getLyrics(twinkleFileName);
        this.happyLyrics = FileReader.getLyrics(happFileName);
    }

    public void pressStartButton()
    {
        
    }
}
