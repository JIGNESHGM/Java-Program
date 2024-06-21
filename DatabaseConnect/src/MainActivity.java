import java.sql.*;

public class MainActivity {
    public static void main(String[] args) {
        BankCustomerDAO dao = new BankCustomerDAO();

        // Create table
        dao.createTable();

        // Insert records
        BankCustomer customer1 = new BankCustomer(1, "Jignesh Mevada", "jigneshmevada87@gmail.com", Date.valueOf("2003-05-22"));
        BankCustomer customer2 = new BankCustomer(2, "Chirag Mevada", "chiragmevada2005@gmail.com", Date.valueOf("2005-09-16"));

        dao.insertRecord(customer1);
        dao.insertRecord(customer2);

        // Update record
        dao.updateRecord(1, "Vivek Solanki", "viveksolanki01@gmail.com");

        // Get record
        dao.getRecord(1);
        dao.getRecord(2);
        
        // Delete record
        dao.deleteRecord(2);
    }
}
