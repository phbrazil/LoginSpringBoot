/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springbootdemo.form.LoginForm;

/**
 *
 * @author killuminatti08
 */

@Controller
public class LoginController {
    
    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String getLoginForm(){
        return "login";
    }
    
    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String login(@ModelAttribute(name="loginForm") LoginForm loginForm, 
            Model model){
        
        String username = loginForm.getUsername();
        String password = loginForm.getPassword();
        
        if(username.equals("paulo.bezerra@mci-group.com") && password.equals("1234")){
            return "home";
        }
        
        model.addAttribute("invalidCredentials", true);
        return "login";
        
        
    }
    
    
}
