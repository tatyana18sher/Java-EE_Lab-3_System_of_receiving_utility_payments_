package systemofreceiving.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
 
@Controller
public class ServiceController {
 
    @Autowired
    private ServiceService serviceService;
 
    @RequestMapping("/")
    public ModelAndView home() {
        List<Service> listService = serviceService.listAll();
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("listServicer", listService);
        return mav;
    }
    
    @RequestMapping("/new")
    public String newCustomerForm(Map<String, Object> model) {
    	Service service = new Service();
        model.put("customer", service);
        return "new_customer";
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveService(@ModelAttribute("service") Service service) {
        serviceService.save(service);
        return "redirect:/";
    }
    
    @RequestMapping("/edit")
    public ModelAndView editCustomerForm(@RequestParam long service_id) {
        ModelAndView mav = new ModelAndView("edit_service");
        Service service = serviceService.get(id);
        mav.addObject("customer", service);
     
        return mav;
    }
    
    @RequestMapping("/delete")
    public String deleteCustomerForm(@RequestParam long service_id) {
    	serviceService.delete(service_id);
        return "redirect:/";       
    }
    

}
