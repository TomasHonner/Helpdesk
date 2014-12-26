package beans;

import classes.Ticket_Controller;
import classes.Account;
import classes.Type;
import classes.Ticket;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Tomáš Honner
 */
@ManagedBean(name = "DashbordBean")
@Named("DashbordBean")
@SessionScoped
public class Dashbord_Bean {

    private Account user;
    private Type privileges;
    
    private Ticket_Controller tc;
    
    private List<Ticket> tickets;
    
    public Dashbord_Bean(Account user, int priv) {
        this.user = user;
        this.privileges = user.getAccountType();
        this.tc = new Ticket_Controller(); 
        this.tickets = tc.loadTickets(privileges, user);
    }
    
    

    public Account getUser() {
        return user;
    }

    public Type getPrivileges() {
        return privileges;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }
    
    public String  createTicket()
    {
        return "createTicket";
    }
    
     public String  createAccount()
    {
        return "createAccount";
    }

   
    
}
