import utils.SQLUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransTest {
    public static void main(String[] args) throws SQLException {
        Connection connection = SQLUtils.getConnect();

        connection.setAutoCommit(false);

        Statement statement = connection.createStatement();
        String sql = "insert into "
    }
}
