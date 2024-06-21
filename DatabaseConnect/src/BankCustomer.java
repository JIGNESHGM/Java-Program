import java.sql.Date;

public class BankCustomer {
    private int customerId;
    private String name;
    private String email;
    private Date createdDate;

    public BankCustomer(int customerId, String name, String email, Date createdDate) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.createdDate = createdDate;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
