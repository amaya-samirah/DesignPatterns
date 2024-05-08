//2024 Amaya Shabazz CSCE 247 
//
import java.util.ArrayList;

public class QuickSort implements SortBehavior{
    
    
   @Override
    public ArrayList<Appartment> sort(ArrayList<Appartment> appartments)
    {

        appartments = quickSort(appartments);

        return appartments;
    }
    //-------------------quick sort process from https://stackoverflow.com/questions/33970992/quicksort-an-arraylist-of-strings -----------
    private ArrayList<Appartment> quickSort(ArrayList<Appartment> appartments)
    {
        if(appartments.isEmpty())
        {
            return appartments;
        }
        ArrayList<Appartment> sortedAppartments; //the list after it's been sorted will go here
        ArrayList<Appartment> lessThanPivot = new ArrayList<Appartment>();
        ArrayList<Appartment> greaterThanPivot = new ArrayList<Appartment>();

        Appartment pivot = appartments.get(0); //pivot will start and beginning
        int i;
        Appartment tempAppartment;
        for(i =1;i<appartments.size();i++)
        {
            tempAppartment = appartments.get(i);
            if(tempAppartment.compareTo(pivot)>0)
            {
                lessThanPivot.add(tempAppartment);
            }
            else if(tempAppartment.compareTo(pivot)<0)
            {
                greaterThanPivot.add(tempAppartment);
            }
        }
        lessThanPivot = quickSort(lessThanPivot);
        greaterThanPivot = quickSort(greaterThanPivot);
        lessThanPivot.add(pivot);
        lessThanPivot.addAll(greaterThanPivot);
        sortedAppartments = lessThanPivot;

        return sortedAppartments;

    }
}
