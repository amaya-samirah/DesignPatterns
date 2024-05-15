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
       String[] temp = passwordBeginning.password.split("");
       for(int index = 0;index<temp.length;index++)
       {
           if(index!=0)
           {
               temp[0] = temp[0].concat(temp[index]);
           }
       }
       password = temp[0];
        for(int index = temp.length-1;index>0;index--)
        {
            password = password.concat(temp[index]);
        }
       String[] newTemp = temp[0].split("");
       password = password.concat(newTemp[0]);
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
