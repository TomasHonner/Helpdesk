package beans;

import classes.Ticket_Controller;
import classes.Account;
import classes.Type;

import java.util.Date;
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
    
    private Date datetime;
    private String customer;
    private String customerText;
    private String technician;
    private String technicianText;
    private String category;
    private int status;
    
    private Ticket_Controller tc;
    
    public Dashbord_Bean(Account user, int priv) {
        this.user = user;
        this.privileges = user.getAccountType();
        this.tc = new Ticket_Controller(); 
    }
    
    

    public Account getUser() {
        return user;
    }

    public Type getPrivileges() {
        return privileges;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCustomerText() {
        return customerText;
    }

    public void setCustomerText(String customerText) {
        this.customerText = customerText;
    }

    public String getTechnician() {
        return technician;
    }

    public void setTechnician(String technician) {
        this.technician = technician;
    }

    public String getTechnicianText() {
        return technicianText;
    }

    public void setTechnicianText(String technicianText) {
        this.technicianText = technicianText;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
}
