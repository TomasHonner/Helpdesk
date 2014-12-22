/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Tomáš Honner
 */
@Named
@RequestScoped
public class Authentization_Filter {

    private String login;
    private String password;
    
    public Authentization_Filter() {
    }
    
    
    
}
