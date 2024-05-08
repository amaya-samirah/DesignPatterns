import java.util.ArrayList;

public class BubbleSort implements SortBehavior{
    @Override
    public ArrayList<Appartment> sort(ArrayList<Appartment> appartments)
    {
        boolean swapped = true;
        while(swapped!=false)
        {
            swapped = false;
            for(int i=0;i<appartments.size();i++) //ASK QUESTION: is appartments.size() equivalent to array.lenght for a normal array?
            {
                if(appartments.get(i+1)==null)
                    break;
                if(appartments.get(i).compareTo(appartments.get(i+1))<0) //this price is greater than price in parameter
                {
                    Appartment temp = appartments.get(i);
                    appartments.set(i, appartments.get(i+1));
                    appartments.set(i+1, temp);
                    swapped = true;
                }

            }
        }

        return appartments;
    }
}
