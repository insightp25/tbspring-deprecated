package book.tbspring.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnectionMaker {

    public Connection makeNewConnection() throws ClassNotFoundException, SQLException {
        // Class.forName("com.mysql.jdbc.Driver"); // deprecated
        Connection c = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1/tbspringdb", "", "");
        return c;
    }
}
