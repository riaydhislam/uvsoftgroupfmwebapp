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

import uvsoftgroup.uvsoftgroupurgtnwebapp.model.AddressInfo;
import uvsoftgroup.uvsoftgroupurgtnwebapp.service.AddressInfoService;

@Controller
@RequestMapping("/addressInfo")
public class AddressInfoController {
	
	@Autowired
    private AddressInfoService addressInfoService;
    
    @RequestMapping("/showAddressInfos")
    public ModelAndView findAllAddressInfo() {
    	List<AddressInfo> addressInfos =addressInfoService.findAllAddressInfo();
        Map<String, Object> params = new HashMap<>();
        params.put("addressInfos", addressInfos);
        return new ModelAndView("showAddressInfos",params);
    	
    }
   
    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public String saveCreateAddressInfo(@ModelAttribute("addressInfo") AddressInfo addressInfo) throws Exception {
    	addressInfoService.saveAddressInfo(addressInfo);
        return "redirect:/addressInfo/showAddressInfos";
        
    }

    @RequestMapping(path = "/update/{id}", method = RequestMethod.GET)
    public String editAddressInfo(@ModelAttribute("addressInfo") AddressInfo addressInfo, @PathVariable(value = "id") long id) throws Exception {
    	addressInfoService.findAddressInfo(id);
    	addressInfoService.saveAddressInfo(addressInfo);
        return "redirect:/showAddressInfos";
    }

    @RequestMapping(path = "/delete/{id}", method = RequestMethod.GET)
    public String deleteAddressInfo(@PathVariable(name = "id") long id) {
    	addressInfoService.deleteAddressInfo(id);
        return "redirect:/showAddressInfos";
    }

}
