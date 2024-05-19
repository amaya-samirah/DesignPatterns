import java.util.ArrayList;

/**
 * Holds the information for the music box
 * @author Amaya Shabazz
 */
public class MusicBox {
    private State englishState;
    private State frenchState;
    private State spanishState;
    private State state;

    /**
     * Constructs a new instance of MusicBox
     */
    public MusicBox()
    {
        
    }

    /**
     * Starts the music box
     */
    public void pressStarButton()
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
    /**
     * Sets the state
     * @param state Holds the state to set
     */
    public void setState(State state)
    {
        this.state = state;
    }
    /**
     * Gets the english state
     * @return Will return the English state
     */
    public State getEnglishState()
    {

        return state;
    }

    /**
     * Gets the French state
     * @return Will return the French state
     */
    public State getFrenchState()
    {

        return state;
    }
    /**
     * Gets the Spanish state
     * @return Will return the Spanish state
     */
    public State getSpanishState()
    {

        return state;
    }

    /**
     * Plays the song
     * @param songName Holds the name of the song
     * @param lyrics Holds the song lyrics
     */
    public void playSong(String songName, ArrayList<String> lyrics)
    {
        
    }
}
