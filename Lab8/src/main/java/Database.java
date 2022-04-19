import java.sql.*;
public class Database {
    private static final String URL =
            "jdbc:mysql://localhost:3306/cities";
    private static final String USER = "root";
    private static final String PASSWORD = "Lupu180320";
    private static Connection connection = null;
    private Database() {}
    public static Connection getConnection() {
        if(connection == null)
            connection = createConnection();
        return connection;
    }
    private static Connection createConnection() {
        try {

            connection.setAutoCommit(false);
            return DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (SQLException e) {
            System.err.println(e);
        }
        return null;
    }
    public static void closeConnection() throws SQLException { connection.close();}

    public static void rollback() {
    }
}


