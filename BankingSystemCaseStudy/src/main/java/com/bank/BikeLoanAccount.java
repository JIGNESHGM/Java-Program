import java.sql.SQLException;
import java.util.Map;

public class BikeLoanAccount extends LoanAccount {
    public BikeLoanAccount(Database database) {
        super(database);
    }

    @Override
    public void applyForLoan(Map<String, Object> loanDetails) {
        // Specific logic for applying for a bike loan
    }

    @Override
    public void processLoanApproval(int accountId) {
        // Specific logic for processing bike loan approval
    }

    @Override
    public void calculateEMI(int accountId, double loanAmount, int tenureMonths) {
        // Specific logic for calculating EMI for a bike loan
    }
}
