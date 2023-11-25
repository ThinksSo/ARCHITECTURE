import java.text.DecimalFormat;

public class Account {
    
    public long UserAccountId;
    public DecimalFormat Balance;
    
    
    public Account(long userAccountId, DecimalFormat balance) {
        this.UserAccountId = userAccountId;
        this.Balance = balance;
    }

}
