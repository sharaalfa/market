package artur.sharafutdinov.models.connector;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by tatar on 04.03.17.
 */
public class Connector {
    /**
     * Подключение к базе данных
     */
    private static final String USER = "artur";
    private static final String PASSWORD = "12345";
    private static final String URL = "jdbc:postgresql://localhost:5432/shop";
    private static final String driver = "org.postgresql.Driver";

    /**
     * Логгер
     */
    private static Logger logger = Logger.getLogger(Connector.class);


    /**
     * Профилактика соединения с базой данных
     * @return получаем соединение
     * @throws SQLException соединения
     */
    public static Connection getConnection() throws SQLException {
        try {
            try {
                Class.forName(driver);
            } catch (ClassNotFoundException e) {
                logger.error("JDBC driver is not found!");

            }
            return DriverManager.getConnection(URL, USER,PASSWORD);
        } catch (SQLException e) {
            logger.error("Connection is disable!");
        }
        return null;
    }
}
