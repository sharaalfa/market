package artur.sharafutdinov.services;

import artur.sharafutdinov.exceptions.UserDaoException;

/**
 * Created by tatar on 04.03.17.
 */

/**
 * Интерфейс сервиса пользователя
 */
public interface UserService {
    boolean authorize(String login, String password) throws UserDaoException;
    boolean registration(String login, String password, String lastName,
                         String firstName, String email,
                         String phone);
}
