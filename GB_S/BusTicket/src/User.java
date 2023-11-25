

import java.util.List;

public class User {

    private long Id;
    private String Name;
    private List<Ticket> Tickets;
    private String Login;
    private long PasswordHashCode;
    private long AccountId;
    
    public User(long id, String name, List<Ticket> tickets, String login, long passwordHashCode, long accountId) {
        this.Id = id;
        this.Name = name;
        this.Tickets = tickets;
        this.Login = login;
        this.PasswordHashCode = passwordHashCode;
        this.AccountId = accountId;
    }


    
    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<Ticket> getTickets() {
        return Tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        Tickets = tickets;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public long getPasswordHashCode() {
        return PasswordHashCode;
    }

    public void setPasswordHashCode(long passwordHashCode) {
        PasswordHashCode = passwordHashCode;
    }

    public long getAccountId() {
        return AccountId;
    }

    public void setAccountId(long accountId) {
        AccountId = accountId;
    }

    

}
