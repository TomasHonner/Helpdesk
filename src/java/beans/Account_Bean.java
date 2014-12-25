package beans;

import classes.Account;

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
    
    public Account_Bean() {
    }
    
}
