package classes;

import mock_classes.Accounts_Hibernate;

/**
 *
 * @author Tomáš Honner
 */
public class Authentization_Filter {
    
    private String username;
    private String password;
    
    private boolean usernameValid;
    private boolean passwordValid;
    private boolean validationResult;
    
    private Accounts_Hibernate ah;
    private Account user;
    
    public Authentization_Filter(String username, String password)
    {
        this.username = username;
        this.password = password;
        this.ah = new Accounts_Hibernate();
    }
    
    
    public void verifyAccount()
    {
        if(accountExist())
        {
            checkAccount();
        }
    }
    
    private void checkAccount()
    {
        if(this.username == null || this.username.equals(this.getUser().getEmail()))
        {
            this.usernameValid = false;
        }
        else this.usernameValid = true;
        
        if(this.password == null || this.password.equals(this.getUser().getPassword()))
        {
            this.passwordValid = false;
        }
        else this.passwordValid = true;
        
        if(this.usernameValid == true && this.passwordValid == true)
        {
            this.validationResult = true;
        }
        else this.validationResult = false;
    }
    
    private boolean accountExist()
    {
        if(this.ah.accountExists(this.username))
        {
            this.user = ah.getAccount(this.username);
            return true;
        }
        else return false;
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

    public boolean isUsernameValid() {
        return usernameValid;
    }

    public boolean isPasswordValid() {
        return passwordValid;
    }

    public boolean isValidationResult() {
        return validationResult;
    }

    public Account getUser() {
        return user;
    }
}
