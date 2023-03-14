package book.tbspring.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DConnectionMaker implements ConnectionMaker {

    public Connection makeConnection() throws ClassNotFoundException, SQLException {
        Connection c = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1/tbspringdb", "root", "l$de11@0$ql");
        return c;
    }
}
