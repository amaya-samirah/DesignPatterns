/**
 * Holds the information to decorate the password
 * @author Amaya Shabazz
 */
public abstract class PasswordDecorator extends Password{
    protected Password passwordBeginning;

    public PasswordDecorator(Password passwordBeginning)
    {

    }

    public String getPassword()
    {
        return "";
    }
}
