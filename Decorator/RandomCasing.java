/**
 * Holds the information for the random casing password decorator
 * @author Amaya Shabazz
 */
public class RandomCasing extends PasswordDecorator{

    /**
     * Creates the password with random casing
     * @param passwordbeginning Holds the starting password
     */
    public RandomCasing(Password passwordbeginning)
    {
        super(passwordbeginning);
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
