package artur.sharafutdinov.dao;

import artur.sharafutdinov.exceptions.UserDaoException;
import artur.sharafutdinov.models.pojo.User;

/**
 * Created by tatar on 04.03.17.
 */
public interface UserDao{
    User getUserByLoginAndPassword(String login, String password) throws UserDaoException;

    boolean registrationUser(String login, String password,
                             String lastName, String firstName,
                             String email, String phone);


}
