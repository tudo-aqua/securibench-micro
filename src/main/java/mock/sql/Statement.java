package mock.sql;

public class Statement {

    public void execute(String s) throws SQLException {
        if (s.contains("<bad/>")) {
            assert false;
        }
    }

    public void executeUpdate(String s, Object ... o) throws SQLException {
        if (s.contains("<bad/>")) {
            assert false;
        }
    }

    public void executeQuery(String s) {
        if (s.contains("<bad/>")) {
            assert false;
        }
    }
}
