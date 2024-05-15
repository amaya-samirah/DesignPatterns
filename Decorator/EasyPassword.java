/**
 * Holds the information for an easy password
 * @author Amaya Shabazz
 */
public class EasyPassword extends Password{

    /**
     * Constucts an easy password
     * @param phrase Will return the new password
     */
    public EasyPassword(String phrase)
    {
        String[] phraseArray = phrase.split(" ");
      
        for(int size =0;size<phraseArray.length;size++)
        {
            System.out.println(phraseArray[size]+"-");
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
