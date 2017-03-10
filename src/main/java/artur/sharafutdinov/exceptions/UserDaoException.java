package artur.sharafutdinov.exceptions;


import org.apache.log4j.Logger;

/**
 * Created by tatar on 04.03.17.
 */
public class UserDaoException extends Exception {
    Logger logger = Logger.getLogger(UserDaoException.class);
    public UserDaoException userDaoException() {
        logger.trace("Dao exceptions");
        return null;
    }
}
