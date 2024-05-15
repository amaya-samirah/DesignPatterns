/**
 * Holds the information for an easy password
 * @author Amaya Shabazz
 */
import java.util.Random;
public class EasyPassword extends Password{

    /**
     * Constucts an easy password
     * @param phrase Holds the original password
     */
    public EasyPassword(String phrase)
    {
        Random random = new Random();
        int number = random.nextInt(0, 101);
        String[] phraseArray = phrase.split(" ");
      
        for(int size =0;size<phraseArray.length;size++)
        {   
            if(size==phraseArray.length-1)
            {
                System.out.println(phraseArray[size]+"-"+number);
            }
            else
            {
                System.out.println(phraseArray[size]+"-");
            }
        }
    }

    /**
     * Accesses the password
     * @return Will return the password
     */
    public String getPassword()
    {
        return password;
    }
}
