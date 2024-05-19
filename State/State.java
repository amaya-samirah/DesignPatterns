/**
 * Holds the information for each state
 * @author Amaya Shabazz
 */
import java.util.ArrayList;
public abstract class State {
    protected MusicBox box;
    private final ArrayList<String> starLyrics;
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
     * Starts the twinkle state
     */
    public void pressStarButton()
    {
        s("Playing \"Twinkle Twinkle Litte Star\"");
        
    }

    /**
     * Starts the happy state
     */
    public void pressHappyButton()
    {
        s("Playing \"If You're Happy and You Know It\"");
    }

    /**
     * Starts the English state
     */
    public abstract  void pressEnglishButton();

    /**
     * Starts the French state
     */
    public abstract void pressFrenchButton();

    /**
     * Starts the Spansih state
     */
    public abstract void pressSpanishButton();

    /**
     * Prints out to console
     * @param string Holds the string to print
     */
    private void s(String string)
    {
        System.out.println(string);

    }
}
