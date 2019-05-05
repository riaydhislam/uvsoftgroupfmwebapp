package uvsoftgroup.uvsoftgroupurgtnwebapp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import uvsoftgroup.uvsoftgroupurgtnwebapp.model.UserRole;
import uvsoftgroup.uvsoftgroupurgtnwebapp.service.UserRoleService;

@Controller
@RequestMapping("/userRole")
public class UserRoleController {
	
	@Autowired
    private UserRoleService userRoleService;
      
    @RequestMapping("/showUserRoles")
    public ModelAndView findAllUserRole() {
    	List<UserRole> userRoles =userRoleService.findAllUserRole();
        Map<String, Object> params = new HashMap<>();
        params.put("userRoles", userRoles);
        return new ModelAndView("showUserRoles",params);
    	
    }
   
    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public String saveCreateUserRole(@ModelAttribute("userRole") UserRole userRole) throws Exception {
    	userRoleService.saveUserRole(userRole);
        return "redirect:/userRole/showUserRoles";
    }

    @RequestMapping(path = "/update/{id}", method = RequestMethod.GET)
    public String editUserRole(@ModelAttribute("userRole") UserRole userRole, @PathVariable(value = "id") long id) throws Exception {
    	userRoleService.findUserRole(id);
    	userRoleService.saveUserRole(userRole);
        return "redirect:/showUserRoles";
    }

    @RequestMapping(path = "/delete/{id}", method = RequestMethod.GET)
    public String deleteUserRole(@PathVariable(name = "id") long id) {
    	userRoleService.deleteUserRole(id);
        return "redirect:/showUserRoles";
    }
    

}
