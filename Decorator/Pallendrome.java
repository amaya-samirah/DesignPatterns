/**
 * Holds the information to decorate the password with pallendromes
 * @author Miyah_Queen645
 */
public class Pallendrome extends PasswordDecorator{
    
    /**
     * Decorates the password with a pallendrome
     * @param passwordBeginning Holds the starting password
     */
    public Pallendrome(Password passwordBeginning)
    {
        super(passwordBeginning);

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
