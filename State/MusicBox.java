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
        englishState = new EnglishState(this);
        frenchState = new FrenchState(this);
        spanishState = new SpanishState(this);
    }

    /**
     * Starts the music box
     */
    public void pressStarButton()
    {
        state.pressStarButton();
    }
     /**
     * Starts the happy state
     */
    public void pressHappyButton()
    {
        state.pressHappyButton();
    }
    /**
     * Starts the English state
     */
    public void pressEnglishButton()
    {
        if(state == englishState)
        {
            s("Already in English mode...");
        }
        else
        {
            this.state = englishState;
            state.pressEnglishButton();
        }
    }
    /**
     * Starts the French state
     */
    public void pressFrenchButton()
    {
        if(state == frenchState)
        {
            s("Already in French mode...");
        }
        else
        {
            this.state = frenchState;
            state.pressFrenchButton();
        }

    }
    /**
     * Starts the Spansih state
     */
    public void pressSpanishButton()
    {

        if(state == spanishState)
        {
            s("Already in Spanish mode...");
        }
        else
        {
            this.state = spanishState;
            state.pressSpanishButton();
        }
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
        return englishState;
    }

    /**
     * Gets the French state
     * @return Will return the French state
     */
    public State getFrenchState()
    {
        return frenchState;
    }
    /**
     * Gets the Spanish state
     * @return Will return the Spanish state
     */
    public State getSpanishState()
    {
        return spanishState;
    }

    /**
     * Plays the song
     * @param songName Holds the name of the song
     * @param lyrics Holds the song lyrics
     */
    public void playSong(String songName, ArrayList<String> lyrics)
    {
        for(int index = 0;index<lyrics.size();index++)
        {
            s(lyrics.get(index));
            LanguageSongs.sleep();
        }
        LanguageSongs.clear();
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
