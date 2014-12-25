package mock_classes;

import classes.Account;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.List;
/**
 *
 * @author Tomáš Honner
 */
public class Accounts_Hibernate {
    
    public Accounts_Hibernate()
    {
        
    }
    
    public List<Account> loadAccountsList()
    {
        List<Account> l = null;
        return l;
    }
    
    public boolean accountExists(String username)
    {
        if("ano" == "ano")
        {
            return true;
        }
        else return false;
    }
    
    public Account getAccount(String username)
    {
        // toto je pouze mock trida
        Account a = new Account();
        return a;
    }
    
    public List<Account> getTechnicianAccounts()
    {
        List<Account> l = null;
        return l;
    }
    
    public List<Account> getCustomersAccounts()
    {
        List<Account> l = null;
        return l;
    }
    
    public void saveAccountsList(List<Account> l)
    {
        
    }
    
    public void addAccount(Account a)
    {
        
    }
    
    public void deleteAccount(int id)
    {
        
    }
}
