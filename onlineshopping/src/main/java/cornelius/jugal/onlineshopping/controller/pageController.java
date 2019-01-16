package cornelius.jugal.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class pageController {
	
     @RequestMapping(value = {"/","/home","/index"})
     public ModelAndView index() {
    	 ModelAndView mv = new ModelAndView("page");
    	 //here in my controller i add the title and onclick for HomePage
    	 mv.addObject("title","Home");
    	 mv.addObject("userClickHome",true);
    	 return mv;
     }
     
     @RequestMapping(value = {"/about"})
     public ModelAndView about() {
    	 ModelAndView mv = new ModelAndView("page");
    	 //here in my controller i add the title and onclick for HomePage
    	 mv.addObject("title","About Us");
    	 mv.addObject("userClickAbout",true);
    	 return mv;
     }
     
     @RequestMapping(value = {"/contact"})
     public ModelAndView contact() {
    	 ModelAndView mv = new ModelAndView("page");
    	 //here in my controller i add the title and onclick for HomePage
    	 mv.addObject("title","Contact Us");
    	 mv.addObject("userClickContact",true);
    	 return mv;
     }

}
