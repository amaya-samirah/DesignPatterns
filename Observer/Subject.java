/**
 * Holds the method for Subject
 * @author Amaya Shabazz
 */
public interface Subject {
    /**
     * Registers the observer
     * @param observer Holds the observer
     */
    public void registerObserver(Observer observer);

    /**
     * Removes the observer
     * @param observer Holds the observer
     */
    public void removeObserver(Observer observer);

    /**
     * Notifies the observer
     */
    public void notifyObserver();
}
