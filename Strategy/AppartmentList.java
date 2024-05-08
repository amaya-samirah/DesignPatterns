//Amaya Shabazz 2024 CSCE 247
//
import java.util.ArrayList;


public class AppartmentList extends Appartment implements SortBehavior{
    
    //ASK QUESTION: i have no idea what's wrong with this and what the uml means
    //---------
    private final ArrayList<Appartment> appartments = new ArrayList<Appartment>();

    private final SortBehavior sortBehavior() = new SortBehavior();
   //--------

   public AppartmentList(String listAddress, int listNumBedrooms, int listNumBathrooms, double listPrice)
   {
        super(listAddress, listNumBedrooms, listNumBathrooms, listPrice);
   }
   
   
}
