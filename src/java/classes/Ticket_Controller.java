package classes;

import mock_classes.Tickets_Hibernate;
import mock_classes.Accounts_Hibernate;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Tomáš Honner
 */
public class Ticket_Controller {
    
    private List<Ticket> ticketsToShow;
    
    private Tickets_Hibernate tickets;
    private Accounts_Hibernate accounts;
    private List<Account> technicians;
    //private List<Tickets_Hibernate> listOfTickets;
    
    public Ticket_Controller()
    {
        this.ticketsToShow = null;
        this.accounts = new Accounts_Hibernate();
        this.technicians = this.accounts.getTechnicianAccounts();
    }
    
    public void toShow(int i, Account a)
    {
        switch(i)
        {
            case 1 : this.ticketsToShow = this.getListOfAllTickets(); break;
            case 2 : this.ticketsToShow = this.getListOfTicketsByCustomerAccount(a); break;
            case 3 : this.ticketsToShow = this.getListOfTicketsByTechnicianAccount(a); break;
            case 4 : this.ticketsToShow = this.getListOfSolvingTicketsByTechnicianAccount(a); break;
        }
    }
    
    public List<Ticket> loadTickets(Type t, Account a)
    {
        List<Ticket> l = null;
        switch(t)
        {
            case CUSTOMER : l = this.getListOfTicketsByCustomerAccount(a);
            case TECHNICIAN : l = this.getListOfTicketsByTechnicianAccount(a);
        }
        return l;
    }
    
    public List<Ticket> getListOfAllTickets()
    {
        List<Ticket> l = tickets.loadAllTickets();
        return l;
    }
 
    public List<Ticket> getListOfTicketsByCustomerAccount(Account customer)
    {
       List<Ticket> l = tickets.loadListOfTicketsByCostumer(customer);
       return l;
    }
    
    public List<Ticket> getListOfTicketsByTechnicianAccount(Account technician)
    {
       List<Ticket> l = tickets.loadListOfTicketsByCostumer(technician);
       return l;
    }
    
    public List<Ticket> getListOfSolvingTicketsByTechnicianAccount(Account technician)
    {
       List<Ticket> l = tickets.loadListOfTicketsByCostumer(technician);
       return l;
    }
     
    public void createTicket(Account customer, String cMessage, Category category)
    {
        Ticket t = new Ticket(customer, new Date(), category, cMessage, Status.NEW);
        t.setTechnician(assignLogic(t));
    }
    
    public Account assignLogic(Ticket t)
    {
        Account a = null;
        Status s = t.getStatus();
        switch(s)
        {
            case NEW : a = assignTechnicianByCategory(t.getCategory()); break;
            case REASSIGNING : a = assignTicketReassign(t.getListOfTechnicians()); break;
        }
        return a;
    }
    
    private Account assignTechnicianByCategory(Category c)
    {
        for(Account a : this.technicians)
        {
            if(a.getCategoryforTecnician() == c)
            {
                return a;
            }
        }
        return null;
    }
    
    private Account assignTicketReassign(HashMap<Account, Status> t)
    {
        Account a = null;
        int i =1;
        while(i==1)
        {
            for(Account aa : this.technicians)
            {
                if(t.get(aa) == null)
                {
                    a = aa;
                    i = 0;
                }
                else continue;
            }
        }
        return a;
    }
    
    public Ticket changeCustomerText(Ticket t, String text)
    {
        String temp = t.getCustomerText();
        temp = temp + text;
        t.setCustomerText(temp);
        return t;
    }
    
    public Ticket changeTechnicianText(Ticket t, String text)
    {
        String temp = t.getTechnicianText();
        temp = temp + text;
        t.setTechnicianText(temp);
        return t;
    }
    
    public void updateTicket(Ticket t)
    {
        this.tickets.updateTicket(t.getTicketID());
    }
    
    private Ticket changeStatus(Ticket t, Status status)
    {
        t.setStatus(status);
        return t;
    }

    public List<Ticket> getTicketsToShow() {
        return ticketsToShow;
    }

    public void setTicketsToShow(List<Ticket> ticketsToShow) {
        this.ticketsToShow = ticketsToShow;
    }
}
