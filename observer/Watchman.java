/**
 * @author Aaron L. Keys
 */
package observer;

import java.util.*;

public class Watchman implements Subject {
    //Declaring class variables.
    private ArrayList<Observer> observers;
    private int warning;

    /**
     * This is the constructor method that initializes the
     * observer ArrayList.
     */
    public Watchman() {
        observers = new ArrayList<Observer>();
    }
    /**
     * This method is used to add an observer to our ArrayList of Observers.
     * @param observer is an observer that has been chosen to be added to our list.
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    /**
     * This method removes an obverser from the ArrayList of observers.
     * @param observer is an observer that has been chosen to be removed.
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    /**
     * This method is used to notify all Observers of some impending danger. 
     */
    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(warning);
        }        
    }
    /**
     * This method is used to determine how many warning trumpets to play
     * and call another method to notify the observers.
     * @param warning is used to determine the number of trumpets to play.
     */
    public void issueWarning(int warning) {
        this.warning = warning;
        //Determining which message to print
        if(warning == 1) {
            System.out.println("WARNING:  1 trumpet was played!");
        } else if(warning == 2) {
            System.out.println("WARNING:  2 trumpets were played!");
        } else {
            //Error message
            System.out.println("UNKNOWN NUMBER OF TRUMPETS PLAYED!");
        }
        notifyObservers();
    }
}
