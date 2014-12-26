package beans;

import classes.Account;
import classes.Category;
import classes.Type;
import classes.Account_Controller;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Tomáš Honner
 */
@ManagedBean(name = "AccountBean")
@Named("AccountBean")
@SessionScoped
public class Account_Bean {

    private Account user;
    private List<Account> accounts;
    private Account_Controller ac;
    
    private String username;
    private String password;
    private Type  accountType;
    private Category technicianCategory;
    
    public Account_Bean() {
        this.ac = new Account_Controller();
    }
    
    public void saveAccount()
    {
        // napsat nejakou ochranu
        ac.createAccount(this.username, this.password, this.accountType, this.technicianCategory);
        
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public String getUsename() {
        return username;
    }

    public void setUsename(String usename) {
        this.username = usename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Type getAccountType() {
        return accountType;
    }

    public void setAccountType(Type accountType) {
        this.accountType = accountType;
    }

    public Category getTechnicianCategory() {
        return technicianCategory;
    }

    public void setTechnicianCategory(Category technicianCategory) {
        this.technicianCategory = technicianCategory;
    }
    
}
