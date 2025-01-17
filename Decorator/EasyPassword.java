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
                String temp = phraseArray[size];
                phraseArray[size] = temp+"-"+number;
            }
            else
            {
                String temp = phraseArray[size];
                phraseArray[size] = temp+"-";
            }
        }
        for(int index = 0;index<phraseArray.length;index++)
        {
            if(index!=0)
            {
                phraseArray[0] = phraseArray[0].concat(phraseArray[index]);
            }
        }
        password = phraseArray[0];
    }

    /**
     * Accesses the password
     * @return Will return the password
     */
    @Override
    public String getPassword()
    {
        return password;
    }
}
