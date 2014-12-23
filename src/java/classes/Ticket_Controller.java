package classes;

import mock_classes.Ticket_Mock;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Tomáš Honner
 */
public class Ticket_Controller {
    
    private Ticket_Mock ticket;
    private List<Ticket_Mock> listOfTickets;
    
    public Ticket_Controller()
    {
        
    }
    
    public void getListOfTicketsByCostumer(int customerID)
    {
       // nejaky 
    }
    
    public void getListOfTicketsByTechnician()
    {
        
    }
     
    public void createTicket(int customerID, String customer, Date date,String cMessage, int category)
    {
        // nejak udelat id
        Ticket_Mock t = new Ticket_Mock();
        t.setCustomerID(customerID);
        t.setCustomer(customer);
        t.setDatetime(date);
        t.setCustomerText(cMessage);
        t.setCategory(category);
        
        assignTechnician(t);
        
    }
    
    private void assignTechnician(Ticket_Mock t)
    {
        if(t.getListOfTechnicians() == null)
        {
            
        }
        else
        {
            
        }
    }
}
