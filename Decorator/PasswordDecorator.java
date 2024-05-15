/**
 * Holds the information to decorate the password
 * @author Amaya Shabazz
 */
public abstract class PasswordDecorator extends Password{
    protected Password passwordBeginning;

    /**
     * Creates a new password decorator
     * @param passwordBeginning Holds the beginning of the password
     */
    public PasswordDecorator(Password passwordBeginning)
    {

    }

    /**
     * Accesses the password
     * @return Will return the password
     */
    public String getPassword()
    {
        return "";
    }
}
