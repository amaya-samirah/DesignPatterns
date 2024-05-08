//2024 Amaya Shabazz CSCE 247 
//
import java.util.ArrayList;

public class QuickSort {
    
    //ASK QUESTION: is this the correct way to implement quicksort? Unsure what to do when it comes to arrayList
    public ArrayList<Appartment> sort(ArrayList<Appartment> appartments)
    {
       int start = 0;
       int end = appartments.size();
        quickSort(appartments, start, end);

        return appartments;
    }
    public void  quickSort(ArrayList<Appartment> appartments, int start, int end)
    {
        if(start>=end)
        {
            return;
        }
        int pivotIndex = partition(appartments);
        quickSort(appartments, start, pivotIndex-1);
        quickSort(appartments, pivotIndex+1, end);


    }

    public int partition(ArrayList<Appartment> appartments)
    {
        int appartmentsLength = appartments.size();
        Appartment pivot = appartments.get(appartmentsLength);
        int i=0;
        for(int j=0;i<appartmentsLength;j++)
        {
            if(appartments.get(j).compareTo(pivot) > 0) //this appartment is less than parameter appartment
            { 
                //swapp
                Appartment temp = appartments.get(i);
                appartments.set(i, appartments.get(j));
                appartments.set(j, temp);
                i++;
            }
        }
        //final swap
        Appartment temp = appartments.get(i);
        appartments.set(i, appartments.get(appartmentsLength)); //pivot
        appartments.set(appartmentsLength, temp);
        return i; //returns pivot index



    }
}
