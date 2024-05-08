//Amaya Shabazz 2024 CSCE 247
//
import java.util.ArrayList;


public class AppartmentList extends Appartment implements SortBehavior{
    
    //ASK QUESTION: i have no idea what's wrong with this and what the uml means
    // what is sortBehavior supposed to be
    //---------
    private ArrayList<Appartment> appartments;

    private SortBehavior sortBehavior;  
   //--------

   
   //the uml doesn't give parameters so is this right?? it's an error if i don't use the paremeters
   //i need a defualt constructor but it wont work becuase extends Appartment which doesn't have a default constructor
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
    sortBehavior = new BubbleSort(); //???

   }

   public ArrayList<Appartment> getSortedList()
   {
    // sortBehavior.sort(appartments); //ASK QUESTION: am i using the right variable?
    // return appartments; 
    sort(appartments);
    return appartments;
   }

   public ArrayList<Appartment> getUnsortedList()
   {
    return appartments;
   }
   @Override
   public ArrayList<Appartment> sort(ArrayList<Appartment> appartments)
   {
    setSortBehavior(sortBehavior);
    sortBehavior.sort(appartments);
    return appartments;
   }


   

   
}
