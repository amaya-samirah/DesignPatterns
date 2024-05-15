

/**
 * Holds the information for the password symbols
 * @author Amaya Shabazz
 */
public class Symbols extends PasswordDecorator{
    
    /**
     * Decorates the password with symbols
     * @param passwordBeginning Holds the starting password
     */
    public Symbols(Password passwordBeginning)
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
