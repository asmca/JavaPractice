package DesignPattern.ObserverPattern;

/**
 * file in DesignPattern.ObserverPattern
 * Created by suse on 15-1-18.
 */
public interface Subject {
    public void registerObserver(Observer O);
    public void removeObserver(Observer O);
    public void notifyObservers();
}

