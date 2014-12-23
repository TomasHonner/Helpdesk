package classes;
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
    
    public Authentization_Filter(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
    
    
    public void verifyAccount()
    {
        if(this.username == null || this.username.equals(""))
        {
            this.usernameValid = false;
        }
        else this.usernameValid = true;
        if(this.password == null || this.password.equals(""))
        {
            this.passwordValid = false;
        }
        else this.passwordValid = true;
        
        if(this.usernameValid == true && this.passwordValid == true)
        {
            this.validationResult = true;
        }
        else this.validationResult = false;
        
        System.out.println(this.usernameValid+""+this.passwordValid+""+this.validationResult);
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

    public void setUsernameValid(boolean usernameValid) {
        this.usernameValid = usernameValid;
    }

    public boolean isPasswordValid() {
        return passwordValid;
    }

    public void setPasswordValid(boolean passwordValid) {
        this.passwordValid = passwordValid;
    }

    public boolean isValidationResult() {
        return validationResult;
    }

    public void setValidationResult(boolean validationResult) {
        this.validationResult = validationResult;
    }
}
