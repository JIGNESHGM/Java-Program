import java.sql.SQLException;
import java.util.Map;

public abstract class LoanAccount extends Account {
    public LoanAccount(Database database) {
        super(database);
    }

    public abstract void applyForLoan(Map<String, Object> loanDetails);

    public abstract void processLoanApproval(int accountId);

    public abstract void calculateEMI(int accountId, double loanAmount, int tenureMonths);
}
