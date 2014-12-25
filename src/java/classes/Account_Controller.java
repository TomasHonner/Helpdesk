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
    
    public void createAccount(int id, String email, String password, Type accountType)
    {
        Account a = new Account(id, email, password, accountType);
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
