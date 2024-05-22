/**
 * Holds the information for the math game
 * @author Amaya Shabazz
 */
import java.util.ArrayList;
import java.util.Iterator;
public class MathGame {
    public static int NUM_QUESTIONS;
    private static MathGame mathGame;
    private ArrayList<Question> questions;
    //ask where supposed to get/make array of questions

    /**
     * Constructs a new instance of math game for the class
     */
    private MathGame()
    {
        NUM_QUESTIONS = 3;
        questions = new ArrayList<Question>();
        for(int index = 0; index < NUM_QUESTIONS; index++)
        {
         //how to add questions to the array ???
         questions.add(new Question());
        }
    }

    /**
     * Constructs a new instane of math game for outside classes
     * @return
     */
    public static MathGame getInstance()
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
       return questions.iterator();
    }
}
