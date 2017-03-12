package artur.sharafutdinov.observer;

import java.util.List;

/**
 * Created by tatar on 12.03.17.
 */
public class Subscriber implements Observer {


    public void handleEvent(Double errorAndOmissions) {
        System.out.println("Dear " + errorAndOmissions);
    }
}
