//Amaya Shabazz 2024 CSCE 247
//
import java.util.ArrayList;


public class AppartmentList extends Appartment implements SortBehavior{
    
    //ASK QUESTION: i have no idea what's wrong with this and what the uml means
    // what is sortBehavior supposed to be
    //---------
    private ArrayList<Appartment> appartments = new ArrayList<Appartment>();

    private SortBehavior sortBehavior = new SortBehavior();
   //--------

   public AppartmentList(String listAddress, int listNumBedrooms, int listNumBathrooms, double listPrice)
   {
     super(listAddress, listNumBedrooms, listNumBathrooms, listPrice);
   }
   
   public void add(String address, int numBedrooms, int numBathrooms, double price)
   {
     Appartment newAppartment = new Appartment(address, numBedrooms, numBathrooms, price);
     appartments.add(newAppartment);

   }

   public void setSortBehavior(SortBehavior sortBehavior)
   {
    //ASK QUESTION: what am i supposed to set behavior to?
    

   }
   

   
}
