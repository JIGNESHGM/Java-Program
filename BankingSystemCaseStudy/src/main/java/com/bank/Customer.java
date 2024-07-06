public abstract class Customer implements ICustomerService {
    private Database database;

    public Customer(Database database) {
        this.database = database;
    }

    @Override
    public void addCustomer(Map<String, Object> customerData) {
        // Logic to add customer
    }

    @Override
    public void updateCustomer(int customerId, Map<String, Object> customerData) {
        // Logic to update customer
    }

    @Override
    public Map<String, Object> getCustomerDetails(int customerId) {
        // Logic to get customer details
        return null;
    }
}
