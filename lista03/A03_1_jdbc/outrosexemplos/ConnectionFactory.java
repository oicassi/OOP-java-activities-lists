package A03_1_jdbc.outrosexemplos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/exercicio", "root", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
