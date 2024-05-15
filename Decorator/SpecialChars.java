import java.util.Random;

/**
 * Holds the information to decorate password ith special characters
 * @author Amaya Shabazz
 */
public class SpecialChars extends PasswordDecorator{
    
    /**
     * Decorates the beginning password with special characters
     * @param passwordBeginning Holds the starting password
     */
    public SpecialChars(Password passwordBeginning)
    {
        super(passwordBeginning);
        Random random = new Random();
        String[] temp = getPassword().split("");
        for(int index = 0;index<temp.length;index++)
        {
            int chance = random.nextInt(0, 10); //0,1,2 will be the chance for special characters (3/10 = 30%)
            if(chance==0 || chance==1 || chance==2) //special character added
            {
                int type = random.nextInt(0, 7); //each number represents a special character
                switch (type) {
                    case 0:
                        temp[index] = temp[index].concat("*");
                        break;
                    case 1:
                        temp[index] = temp[index].concat("!");
                        break;
                    case 2:
                        temp[index] = temp[index].concat("%");
                        break;
                    case 3:
                        temp[index] = temp[index].concat("+");
                        break;
                    case 4:
                        temp[index] = temp[index].concat(".");
                        break;
                    case 5:
                        temp[index] = temp[index].concat("{");
                        break;
                    case 6:
                        temp[index] = temp[index].concat("}");
                        break;
                    default:
                        break;
                }
            }
            else
            {
                return;
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
