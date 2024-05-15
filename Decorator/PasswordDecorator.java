/**
 * Holds the information to decorate the password
 * @author Amaya Shabazz
 */
public abstract class PasswordDecorator extends Password{
    protected Password passwordBeginning;

    /**
     * Creates a new password decorator
     * @param passwordBeginning Holds the starting password
     */
    public PasswordDecorator(Password passwordBeginning)
    {
        this.passwordBeginning = passwordBeginning;
    }

    /**
     * Accesses the password
     * @return Will return the password
     */
    @Override
    public abstract String getPassword();
}
