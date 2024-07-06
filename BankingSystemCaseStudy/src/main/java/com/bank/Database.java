import java.sql.*;
import java.util.*;

public class Database {
    private Connection connection;

    public Database(String url, String username, String password) throws SQLException {
        this.connection = DriverManager.getConnection(url, username, password);
    }

    public void create(String table, Map<String, Object> record) throws SQLException {
        String columns = String.join(", ", record.keySet());
        String values = String.join(", ", Collections.nCopies(record.size(), "?"));

        String sql = "INSERT INTO " + table + " (" + columns + ") VALUES (" + values + ")";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            int index = 1;
            for (Object value : record.values()) {
                stmt.setObject(index++, value);
            }
            stmt.executeUpdate();
        }
    }

    public Map<String, Object> read(String table, String keyColumn, Object keyValue) throws SQLException {
        String sql = "SELECT * FROM " + table + " WHERE " + keyColumn + " = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setObject(1, keyValue);
            try (ResultSet rs = stmt.executeQuery()) {
                ResultSetMetaData metaData = rs.getMetaData();
                int columnCount = metaData.getColumnCount();
                if (rs.next()) {
                    Map<String, Object> result = new HashMap<>();
                    for (int i = 1; i <= columnCount; i++) {
                        result.put(metaData.getColumnName(i), rs.getObject(i));
                    }
                    return result;
                }
            }
        }
        return null;
    }

    public void update(String table, String keyColumn, Object keyValue, Map<String, Object> newRecord) throws SQLException {
        String setClause = String.join(", ", newRecord.keySet().stream()
                .map(key -> key + " = ?")
                .toArray(String[]::new));

        String sql = "UPDATE " + table + " SET " + setClause + " WHERE " + keyColumn + " = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            int index = 1;
            for (Object value : newRecord.values()) {
                stmt.setObject(index++, value);
            }
            stmt.setObject(index, keyValue);
            stmt.executeUpdate();
        }
    }

    public void delete(String table, String keyColumn, Object keyValue) throws SQLException {
        String sql = "DELETE FROM " + table + " WHERE " + keyColumn + " = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setObject(1, keyValue);
            stmt.executeUpdate();
        }
    }

    public void close() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
}
