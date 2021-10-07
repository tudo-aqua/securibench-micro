package mock.sql;

public class Connection {

    public void prepareStatement(String s) throws SQLException {
        if (s.contains("<bad/>")) {
            assert false;
        }
    }

    public void close() throws SQLException{
    }

    public Statement createStatement() {
        return new Statement();
    }
}
