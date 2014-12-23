package mock_classes;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Tomáš Honner
 */
public class Ticket_Mock {
    
    private int ticketID;
    private int customerID;
    private String customer;
    private Date datetime;
    private int category;
    private int technicianID;
    private String technician;
    private String customerText;
    private String technicianText;
    private int status;
    
    
    // neco kde bude technik a jak resil, asi by to bylo nejlepsi jako trida propojena s accounts
    private List<String> ListOfTechnicians;
    
    public Ticket_Mock()
    {
        
    }

    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getTechnicianID() {
        return technicianID;
    }

    public void setTechnicianID(int technicianID) {
        this.technicianID = technicianID;
    }

    public String getTechnician() {
        return technician;
    }

    public void setTechnician(String technician) {
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public List<String> getListOfTechnicians() {
        return ListOfTechnicians;
    }

    public void setListOfTechnicians(List<String> ListOfTechnicians) {
        this.ListOfTechnicians = ListOfTechnicians;
    }
}
