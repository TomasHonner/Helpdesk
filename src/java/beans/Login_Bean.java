package beans;

import classes.Authentization_Filter;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Tomáš Honner
 */
@ManagedBean(name = "LoginBean")
@Named("LoginBean")
@SessionScoped
public class Login_Bean {

    private String username;
    private String password;
    
    Authentization_Filter af;
    
    public Login_Bean() {
        this.af = new Authentization_Filter(this.username, this.password);
    }
    
    public String verifyAccount()
    {
        this.af.verifyAccount();
        if(this.af.isValidationResult())
        {
            return "dashbord";
        }
        else
        {
            return "index";
        }
    }
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
