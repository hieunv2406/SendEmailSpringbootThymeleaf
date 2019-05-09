package com.itsol.sendgmail.controller;


import com.itsol.sendgmail.bussiness.SendEmailBussiness;
import com.itsol.sendgmail.dto.EmailModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SendEmailController {
    @Autowired
    private SendEmailBussiness sendEmailBussiness;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String getHome(){
        return "formInsertEmail";
    }


    @RequestMapping(value = "/sendMail", method = RequestMethod.POST)
    public String insertEmail(@ModelAttribute("formEmail") EmailModel emailEntities, Model model){

        String emailAddress = emailEntities.getRecipientEmail();
        boolean check = sendEmailBussiness.sendEmail(emailAddress);
        if (check){
            return "index";
        }else {
        model.addAttribute("invalidCredentials",true);
            return "formInsertEmail";
        }
    }
}
