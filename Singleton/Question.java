/**
 * Holds the questions for the game
 * @author Amaya Shabazz
 */
import  java.util.Random;
 public class Question {
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_BLACK = "\u001B[30m";

    private int num1;
    private int num2;
    private int answer;
    private int userAnswer;
    private Operand operand;

    /**
     * Constructs a new instance of question
     */
    public Question()
    {
        //ask what even is supposed to go here
    }

    /**
     * Accesses the question
     * @return Will return a question
     */
    public String getQuestion()
    {
        Random random = new Random();
        num1 = random.nextInt(1, 101);
        num2 = random.nextInt(1, 101);
        int chance = random.nextInt(1, 4); //numbers 1-3 correspond to each operand
        switch(chance)
        {
            case 1:
            {
                answer = num1 + num2;
                //ask how to use the label to print
                break;
            }
            case 2:
            {
                answer = num1 - num2;
                break;

            }
            case 3:
            {
                answer = num1 * num2;
                break;
            }
            default:
                break;
        }
    }

    /**
     * Sets the user's answer
     * @param answer Holds the user's answer
     */
    public void setUserAnswer(int answer)
    {
        this.userAnswer = answer;
    }

    /*
     * Returns true or false if the answer is right
     */
    public boolean isCorrect()
    {
        return userAnswer==answer;
    }

    /**
     * Prints the necessary info to the console
     */
    public String toString()
    {

    }
    
}
