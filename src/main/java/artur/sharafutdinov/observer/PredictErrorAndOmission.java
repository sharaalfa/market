package artur.sharafutdinov.observer;/*package artur.sharafutdinov.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tatar on 12.03.17.
 */
/*public class PredictErrorAndOmission implements Observed {
    List<String> errorAndOmissions = new ArrayList<String>();

    List<Observer> subscribes = new ArrayList<Observer>();
    public void addError (String errors){
        this.errorAndOmissions.add(errors);
        notifyObservers();
    }
    public void removeErrors(String errors){
        this.errorAndOmissions.remove(errors);
        notifyObservers();
    }

    public void addObserver(Observer observer) {
        this.subscribes.add(observer);

    }

    public void removeObserver(Observer observer) {
        this.subscribes.remove(observer);

    }

    public void notifyObservers() {
        for(Observer observer: subscribes){
            observer.handleEvent(this.errorAndOmissions);
        }

    }
}/*/