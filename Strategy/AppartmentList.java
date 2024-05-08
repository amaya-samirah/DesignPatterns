//Amaya Shabazz 2024 CSCE 247
//
import java.util.ArrayList;


public class AppartmentList{
    private ArrayList<Appartment> appartments;

    private SortBehavior sortBehavior;  
   
   public AppartmentList()
   {
        appartments = new ArrayList<Appartment>();
        sortBehavior = new BubbleSort();
   }

   public void add(String address, int numBedrooms, int numBathrooms, double price)
   {
     Appartment newAppartment = new Appartment(address, numBedrooms, numBathrooms, price);
     appartments.add(newAppartment);
   }

   public void setSortBehavior(SortBehavior sortBehavior)
   {
    this.sortBehavior = sortBehavior;
   }

   public ArrayList<Appartment> getSortedList()
   {
    return sortBehavior.sort(appartments);
   }

   public ArrayList<Appartment> getUnsortedList()
   {
    return appartments;
   } 
}
