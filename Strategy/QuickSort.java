//2024 Amaya Shabazz CSCE 247 
//
import java.util.ArrayList;

public class QuickSort implements SortBehavior{
    
    //ASK QUESTION: is this the correct way to implement quicksort? Unsure what to do when it comes to arrayList
   @Override
    public ArrayList<Appartment> sort(ArrayList<Appartment> appartments)
    {
       int start = 0;
       int end = appartments.size()-1;
        quickSort(appartments, start, end);

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
        Appartment j;
        for(i =1;i<appartments.size();i++)
        {
            j = appartments.get(i);
            if(j.compareTo(pivot)<0)
            {
                lessThanPivot.add(j);
            }
            else
            {
                greaterThanPivot.add(j);
            }
        }
        lessThanPivot = quickSort(lessThanPivot);
        greaterThanPivot = quickSort(greaterThanPivot);
        lessThanPivot.add(pivot);
        lessThanPivot.addAll(greaterThanPivot);
        sortedAppartments = lessThanPivot;

        return sortedAppartments;

    }

    // private void quickSort(ArrayList<Appartment> appartments, int start, int end)
    // {
    //     if(start>=end)
    //     {
    //         return;
    //     }
    //     int pivotIndex = partition(appartments);
    //     quickSort(appartments, start, pivotIndex-1);
    //     quickSort(appartments, pivotIndex+1, end);


    // }

    
    // private int partition(ArrayList<Appartment> appartments)
    // {
    //     int appartmentsLength = appartments.size()-1;
    //     Appartment pivot = appartments.get(appartmentsLength);
    //     int i=0;
    //     for(int j=0;j<appartmentsLength;j++)
    //     {
    //         if(appartments.get(j).compareTo(pivot) > 0) //this appartment is less than parameter appartment
    //         { 
    //             //swapp
    //             Appartment temp = appartments.get(i);
    //             appartments.set(i, appartments.get(j));
    //             appartments.set(j, temp);
    //             i++;
    //         }
    //     }
    //     //final swap
    //     Appartment temp = appartments.get(i);
    //     appartments.set(i, appartments.get(appartmentsLength)); //pivot
    //     appartments.set(appartmentsLength, temp);
    //     return i; //returns pivot index



    // }
}
