/**
 * Holds the information to decorate password ith special characters
 * @author Amaya Shabazz
 */
import java.util.Random;
public class SpecialChars extends PasswordDecorator{
    
    /**
     * Decorates the beginning password with special characters
     * @param passwordBeginning Holds the starting password
     */
    public SpecialChars(Password passwordBeginning)
    {
        super(passwordBeginning);

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
