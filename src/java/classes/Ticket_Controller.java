package classes;

import mock_classes.Tickets_Hibernate;
import mock_classes.Accounts_Hibernate;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Tomáš Honner
 */
public class Ticket_Controller {
    
    private Tickets_Hibernate tickets;
    private Accounts_Hibernate accounts;
    //private List<Tickets_Hibernate> listOfTickets;
    
    public Ticket_Controller()
    {
        
    }
 
    // toto NENI id ticketu ale id zakaznika nebo technika
    public List<Ticket> getListOfTicketsByID(int id)
    {
       List<Ticket> l = tickets.loadListOfTicketsByCostumer(id);
       return l;
    }
     
    public void createTicket(Account customer, Date date,String cMessage, Category category)
    {
        Ticket t = new Ticket(customer, date, category, cMessage, Status.NEW);
        List<Account> l = accounts.getTechnicianAccounts();
        for(Account a : l)
        {
            if(a.getCategoryforTecnician() == category)
            {
                t.addTechnician(a, Status.SOLVING);
            }
        }
        
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
    
    public Ticket changeStatus(Ticket t, Status status)
    {
        t.setStatus(status);
        return t;
    }
}
