package mock.sql;

public class DriverManager {
    public static Connection getConnection(String connectionString) {
        return new Connection();
    }
}
