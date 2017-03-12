package artur.sharafutdinov.dao.impl;

import artur.sharafutdinov.dao.UserDao;
import artur.sharafutdinov.exceptions.UserDaoException;
import artur.sharafutdinov.models.connector.Connector;
import artur.sharafutdinov.models.pojo.User;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.text.SimpleDateFormat;


/**
 * Created by tatar on 04.03.17.
 */
@Repository
public class UserDaoImpl implements UserDao{
    /**
     * Логгирование
     */

    Logger logger = Logger.getLogger(UserDaoImpl.class);

    private static final String SQL_FIND_USER =
            "SELECT * FROM \"user\" WHERE login=? AND password=?;";
    private static final String SQL_CREATE_USER =
            "INSERT INTO \"user\"(login, password, " +
                    "last_name, first_name, role_id, " +
                    "email, phone, is_active, updated_date) " +
                    "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";


    public User getUserByLoginAndPassword(String login, String password) throws UserDaoException {
        logger.debug(login + " " + password);

        User user = null;
        try{
            Connection connection = Connector.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_FIND_USER);
            preparedStatement.setString(1, login);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                logger.debug("find");
                user = new User(
                        resultSet.getLong("id"),
                        resultSet.getString("login"),
                        resultSet.getString("password"),
                        resultSet.getString("last_name"),
                        resultSet.getString("first_name"),
                        resultSet.getLong("role_id"),
                        resultSet.getString("email"),
                        resultSet.getString("phone"),
                        resultSet.getString("is_active"),
                        resultSet.getDate("updated_date")
                );
            } else {
                logger.debug(login + " " + password + " not found");
            }
        } catch (SQLException e) {
            logger.error(e);
            throw new UserDaoException();
        }
        return user;
    }


    public boolean registrationUser(String login, String password, String lastName,
                                    String firstName, String email,
                                    String phone) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

        try {
            Connection connection = Connector.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_CREATE_USER);
            preparedStatement.setString(1, login);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, lastName);
            preparedStatement.setString(4, firstName);
            preparedStatement.setLong(5, 2);
            preparedStatement.setString(6, email);
            preparedStatement.setString(7, phone);
            preparedStatement.setBoolean(8, true);
            preparedStatement.setDate(9, new Date(23));
            int count = preparedStatement.executeUpdate();
            if(count > 1) {
                logger.debug(login + " " + password + " not inserted");
            }
        } catch (SQLException e) {
            logger.error(e);
        }
        return false;
    }


}
