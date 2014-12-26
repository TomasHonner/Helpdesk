package classes;

import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author Tomáš Honner
 */
public class Ticket {
 
    private int ticketID;
    private Account customer;
    private Date datetime;
    private Category category;
    private Account technician;
    private String customerText;
    private String technicianText;
    private Status status;
    
    
    // neco kde bude technik a jak resil, asi by to bylo nejlepsi jako trida propojena s accounts
    private HashMap<Account, Status> listOfTechnicians;
    
    public Ticket()
    {
        
    }
    
    public Ticket(Account customer, Date datetime, Category category, String customerText, Status status)
    {
        this.customer = customer;
        this.datetime = datetime;
        this.category = category;
        this.customerText = customerText;
        this.status = status;
    }
    
    public void addTechnician(Account a, Status s)
    {
       this.listOfTechnicians.put(a, s);
    }
    
    public void changeTechnicianStatus(Account a, Status s)
    {
        if(this.listOfTechnicians.containsKey(a))
        {
            this.listOfTechnicians.put(a, s);
        }
        else
        {
            // error
        }
    }

    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    public Account getCustomer() {
        return customer;
    }

    public void setCustomer(Account customer) {
        this.customer = customer;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Account getTechnician() {
        return technician;
    }

    public void setTechnician(Account technician) {
        this.technician = technician;
    }

    public String getCustomerText() {
        return customerText;
    }

    public void setCustomerText(String customerText) {
        this.customerText = customerText;
    }

    public String getTechnicianText() {
        return technicianText;
    }

    public void setTechnicianText(String technicianText) {
        this.technicianText = technicianText;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public HashMap<Account, Status> getListOfTechnicians() {
        return listOfTechnicians;
    }

    public void setListOfTechnicians(HashMap<Account, Status> ListOfTechnicians) {
        this.listOfTechnicians = ListOfTechnicians;
    }

    
    
}
