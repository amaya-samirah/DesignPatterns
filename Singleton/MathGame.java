/**
 * Holds the information for the math game
 * @author Amaya Shabazz
 */
import java.util.ArrayList;
public class MathGame {
    private static int NUM_QUESTIONS;
    private MathGame mathGame;
    private ArrayList<Question> questions;
    //ask where supposed to get/make array of questions

    /**
     * Constructs a new instance of math game for the class
     */
    private MathGame()
    {
        
    }

    /**
     * Constructs a new instane of math game for outside classes
     * @return
     */
    public MathGame getInstance()
    {
        mathGame = new MathGame();
        return mathGame;

    }

    /**
     * Accesses the iterator information
     * @return Will return an iteration of question
     */
    public Iterator<Question> getIterator()
    {
        
    }
}
