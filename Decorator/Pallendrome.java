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
        String[] temp = getPassword().split("");
        for(int index =0;index<temp.length;index++)
        {
            if(index!=temp.length-1)
            {
               temp[0] = temp[index].concat(temp[index+1]);
            }
            else
            {
                temp[0] = temp[index-1].concat(temp[index]);
            }
            password = temp[0];
        }
        for(int index = temp.length-1;index>=0;index--)
        {
            password = password.concat(temp[index]);
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
