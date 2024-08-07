import java.sql.SQLException;
import java.util.Map;

public class HomeLoanAccount extends LoanAccount {
    public HomeLoanAccount(Database database) {
        super(database);
    }

    @Override
    public void applyForLoan(Map<String, Object> loanDetails) {
        // Specific logic for applying for a home loan
    }

    @Override
    public void processLoanApproval(int accountId) {
        // Specific logic for processing home loan approval
    }

    @Override
    public void calculateEMI(int accountId, double loanAmount, int tenureMonths) {
        // Specific logic for calculating EMI for a home loan
    }
}
