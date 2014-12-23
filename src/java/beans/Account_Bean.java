package beans;

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

    
    public Account_Bean() {
    }
    
}
