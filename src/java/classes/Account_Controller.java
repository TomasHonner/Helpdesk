package classes;

import java.util.List;
import mock_classes.Accounts_Hibernate;

/**
 *
 * @author Tomáš Honner
 */
public class Account_Controller {
    
    private Accounts_Hibernate ah = new Accounts_Hibernate();
    
    public Account_Controller()
    {
        
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
    
    public List<Account> getListOfAccounts()
    {
        List<Account> l = ah.loadAccountsList();
        return l;
    }
}
