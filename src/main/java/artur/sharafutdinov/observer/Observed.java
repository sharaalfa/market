package artur.sharafutdinov.observer;

/**
 * Created by tatar on 12.03.17.
 */
public interface Observed {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();

}
