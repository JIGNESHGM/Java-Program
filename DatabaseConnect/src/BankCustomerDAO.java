import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class BankCustomerDAO {

    public void createTable() {
        String createTableSQL = "CREATE TABLE BANK_CUSTOMER("
                + "CUSTOMER_ID NUMBER(5) NOT NULL, "
                + "NAME VARCHAR2(50) NOT NULL, "
                + "EMAIL VARCHAR2(50) NOT NULL, "
                + "CREATED_DATE DATE NOT NULL, "
                + "PRIMARY KEY (CUSTOMER_ID)"
                + ")";

        try (Connection conn = ConnectionManager.getConnection();
             Statement stmt = conn.createStatement()) {

            stmt.execute(createTableSQL);
            System.out.println("Table \"BANK_CUSTOMER\" is created!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insertRecord(BankCustomer customer) {
        String insertSQL = "INSERT INTO BANK_CUSTOMER"
                + "(CUSTOMER_ID, NAME, EMAIL, CREATED_DATE) VALUES"
                + "("+customer.getCustomerId()+", '"
                + customer.getName() + "', '"
                + customer.getEmail() + "', TO_DATE('"
                + customer.getCreatedDate() + "', 'YYYY-MM-DD'))";

        try (Connection conn = ConnectionManager.getConnection();
             Statement stmt = conn.createStatement()) {

            stmt.executeUpdate(insertSQL);
            System.out.println("Record is inserted into BANK_CUSTOMER table!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateRecord(int customerId, String name, String email) {
        String updateSQL = "UPDATE BANK_CUSTOMER SET "
                + "NAME = '" + name + "', "
                + "EMAIL = '" + email + "' "
                + "WHERE CUSTOMER_ID = " + customerId;

        try (Connection conn = ConnectionManager.getConnection();
             Statement stmt = conn.createStatement()) {

            stmt.executeUpdate(updateSQL);
            System.out.println("Record is updated in BANK_CUSTOMER table!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteRecord(int customerId) {
        String deleteSQL = "DELETE FROM BANK_CUSTOMER WHERE CUSTOMER_ID = " + customerId;

        try (Connection conn = ConnectionManager.getConnection();
             Statement stmt = conn.createStatement()) {

            stmt.executeUpdate(deleteSQL);
            System.out.println("Record is deleted from BANK_CUSTOMER table!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void getRecord(int customerId) {
        String selectSQL = "SELECT * FROM BANK_CUSTOMER WHERE CUSTOMER_ID = " + customerId;
        
        try (Connection conn = ConnectionManager.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(selectSQL)) {

            while (rs.next()) {
                System.out.println("Customer ID: " + rs.getInt("CUSTOMER_ID"));
                System.out.println("Name: " + rs.getString("NAME"));
                System.out.println("Email: " + rs.getString("EMAIL"));
                System.out.println("Created Date: " + rs.getDate("CREATED_DATE"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
