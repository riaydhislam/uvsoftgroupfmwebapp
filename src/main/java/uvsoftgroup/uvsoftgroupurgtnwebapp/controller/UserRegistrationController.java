package uvsoftgroup.uvsoftgroupurgtnwebapp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import uvsoftgroup.uvsoftgroupurgtnwebapp.model.UserRegistration;
import uvsoftgroup.uvsoftgroupurgtnwebapp.service.UserRegistrationService;

@Controller

public class UserRegistrationController {
	@Autowired
    private UserRegistrationService userRegistrationService;
    
	@RequestMapping("/")
    public String index(Model model) {
        return "index";
    }    
    
    @RequestMapping("/showUserRegistrations")
    public ModelAndView findAllUserRegistration() {
    	List<UserRegistration> userRegistrations =userRegistrationService.findAllUserRegistration();
        Map<String, Object> params = new HashMap<>();
        params.put("userRegistrations", userRegistrations);
        return new ModelAndView("showUserRegistrations",params);
    	
    }
   
    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public String saveCreateUserRegistration(@ModelAttribute("userRegistration") UserRegistration userRegistration) throws Exception {
    	userRegistrationService.saveUserRegistration(userRegistration);
        return "redirect:/showUserRegistrations";
    }

    @RequestMapping(path = "/update/{id}", method = RequestMethod.GET)
    public String editUserRegistration(@ModelAttribute("userRegistration") UserRegistration userRegistration, @PathVariable(value = "id") long id) throws Exception {
    	userRegistrationService.findUserRegistration(id);
    	userRegistrationService.saveUserRegistration(userRegistration);
        return "redirect:/showUserRegistrations";
    }

    @RequestMapping(path = "/delete/{id}", method = RequestMethod.GET)
    public String deleteUserRegistration(@PathVariable(name = "id") long id) {
    	userRegistrationService.deleteUserRegistration(id);
        return "redirect:/showUserRegistrations";
    }
    
}
