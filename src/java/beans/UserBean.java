package beans;

import classes.Account;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Tomáš Honner
 */
@ManagedBean(name = "UserBean")
@SessionScoped
public class UserBean {

    private Account user;
    
    public UserBean(Account a) {
        this.user = a;
    }

    public Account getUser() {
        return user;
    }

    public void setUser(Account user) {
        this.user = user;
    }
    
    
}
