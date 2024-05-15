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
        super(passwordBeginning); //sets parameter as the beginning password
        String[] temp = password.split("");
        for(int index = 0;index<temp.length;index++)
        {
            if(temp[index].equalsIgnoreCase("a"))
            {
                temp[index] = "@";
            }
            else if(temp[index].equalsIgnoreCase("b"))
            {
                temp[index] = "8";

            }
            else if(temp[index].equalsIgnoreCase("e"))
            {
                temp[index] = "3";
                
            }
            else if(temp[index].equalsIgnoreCase("g"))
            {
                temp[index] = "9";
                
            }
            else if(temp[index].equalsIgnoreCase("i"))
            {
                temp[index] = "!";
                
            }
            else if(temp[index].equalsIgnoreCase("o"))
            {
                temp[index] = "0";
                
            }
            else if(temp[index].equalsIgnoreCase("s"))
            {
                temp[index] = "$";
                
            }
            else if(temp[index].equalsIgnoreCase("t"))
            {
                temp[index] = "7";
                
            }
        }
        for(int index = 0;index<temp.length;index++)
        {
            if(index!=0)
            {
                temp[0] = temp[0].concat(temp[index]);
            }
            else
            {
                return;
            }
        }
        password = temp[0];
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
