public interface ICustomerService {
    void addCustomer(Map<String, Object> customerData);
    void updateCustomer(int customerId, Map<String, Object> customerData);
    Map<String, Object> getCustomerDetails(int customerId);
}
