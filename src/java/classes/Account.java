package classes;

/**
 *
 * @author Tomáš Honner
 */
public class Account {
    private int id;
    private String email;
    private String password;
    private Type accountType;
    private Category categoryforTecnician;
    
    public Account()
    {
        
    }
    
    public Account(int id, String email, String password, Type accountType)
    {
        this.id = id;
        this.email = email;
        this.password = password;
        this.accountType = accountType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Category getCategoryforTecnician() {
        return categoryforTecnician;
    }

    public void setCategoryforTecnician(Category categoryforTecnician) {
        this.categoryforTecnician = categoryforTecnician;
    }

}
