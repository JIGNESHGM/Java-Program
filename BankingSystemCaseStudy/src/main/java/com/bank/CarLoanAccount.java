import java.sql.SQLException;
import java.util.Map;

public class CarLoanAccount extends LoanAccount {
    public CarLoanAccount(Database database) {
        super(database);
    }

    @Override
    public void applyForLoan(Map<String, Object> loanDetails) {
        // Specific logic for applying for a car loan
    }

    @Override
    public void processLoanApproval(int accountId) {
        // Specific logic for processing car loan approval
    }

    @Override
    public void calculateEMI(int accountId, double loanAmount, int tenureMonths) {
        // Specific logic for calculating EMI for a car loan
    }
}
