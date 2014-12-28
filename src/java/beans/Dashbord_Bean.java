package beans;

import classes.Ticket_Controller;
import classes.Account;
import classes.Category;
import classes.Type;
import classes.Ticket;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author Tomáš Honner
 */
@ManagedBean(name = "DashbordBean")
@Named("DashbordBean")
@SessionScoped
public class Dashbord_Bean {

    private final Account user;
    private final Type privileges;
    
    private Ticket_Controller tc;
    
    private List<Ticket> tickets;
    
    private String ntMessage;
    private Category ntCategory;
    
    private Ticket sTicket;
    
    public Dashbord_Bean(Account user, int priv) {
        this.user = user;
        this.privileges = user.getAccountType();
        this.tc = new Ticket_Controller(); 
        this.tickets = tc.loadTickets(privileges, user);
    }
    
    public String createFilledTicket()
    {
        tc.createTicket(user, this.ntMessage, this.ntCategory);
        return "dashbord";
    }
    
    public String solveTicket(int id)
    {
        getTicketFromList(id);
        return "ticket";
    }
    
    public String saveSolvedTicket()
    {
        this.tc.updateTicket(this.sTicket);
        return "dashbord";
    }
    
    public String Logout()
    {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "login?faces-redirect=true";
    }
    
    public void getTicketFromList(int id)
    {
        for(Ticket st : this.tickets)
        {
            if(st.getTicketID() == id)
            {
                this.setsTicket(st);
            }
        }
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
    
    public String  createTicketLink()
    {
        return "createTicket";
    }
    
     public String  createAccountLink()
    {
        return "createAccount";
    }

    public String getNtMessage() {
        return ntMessage;
    }

    public void setNtMessage(String ntMessage) {
        this.ntMessage = ntMessage;
    }

    public Category getNtCategory() {
        return ntCategory;
    }

    public void setNtCategory(Category ntCategory) {
        this.ntCategory = ntCategory;
    }

    public Ticket getsTicket() {
        return sTicket;
    }

    public void setsTicket(Ticket sTicket) {
        this.sTicket = sTicket;
    }

   
    
}
