package classes;

import java.util.List;
import mock_classes.Accounts_Hibernate;

/**
 *
 * @author Tomáš Honner
 */
public class Account_Controller {
    
    private List<Account> listOfAccounts;
    private Accounts_Hibernate ah;
    
    public Account_Controller()
    {
        this.ah = new Accounts_Hibernate();
        this.listOfAccounts = ah.loadAccountsList();
    }
    
    public void createAccount( String email, String password, Type accountType, Category category)
    {
        // udelat id
        // new Account(id, email, password, accountType, category)
        Account a = new Account();
        a.setEmail(email);
        a.setPassword(password);
        a.setAccountType(accountType);
        if(category != null)
        {
            a.setCategoryforTecnician(category);
        }
        ah.addAccount(a);
    }
    
    public void deleteAccount(int id)
    {
        ah.deleteAccount(id);
    }
    
    public Account getAccount(String email)
    {
        for(Account a : this.listOfAccounts)
        {
            if(email.equalsIgnoreCase(a.getEmail()))
            {
                return a;
            }
        }
        return null;
    }
    
    public List<Account> getListOfAccounts()
    {
        List<Account> l = ah.loadAccountsList();
        return l;
    }
}
