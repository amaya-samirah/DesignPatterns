/**
 * Holds the information for the random casing password decorator
 * @author Amaya Shabazz
 */
import java.util.Random;
 public class RandomCasing extends PasswordDecorator{

    /**
     * Creates the password with random casing
     * @param passwordbeginning Holds the starting password
     */
    public RandomCasing(Password passwordbeginning)
    {
        super(passwordbeginning);
        Random random = new Random();
        String[] temp = getPassword().split("");
        for(int index = 0;index<temp.length;index++)
        {
            int chance = random.nextInt(0, 2);
            if(chance==1) //letter will be uppercase
            {
                temp[index] = temp[index].toUpperCase();
            }
            if(chance==2) //letter will be lowercase
            {
                temp[index] = temp[index].toLowerCase();
            }
        }
        for(int index = 0;index<temp.length;index++)
        {
            if(index!=temp.length-1)
            {
               password = temp[index].concat(temp[index+1]);
            }
            else
            {
                password = temp[index-1].concat(temp[index]);
            }
        }
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