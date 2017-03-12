package artur.sharafutdinov.dao;

import java.util.Observer;

/**
 * Created by tatar on 11.03.17.
 */
public interface Observable {
    void addObserver(Observer o);
    void notifyObservers();
}
