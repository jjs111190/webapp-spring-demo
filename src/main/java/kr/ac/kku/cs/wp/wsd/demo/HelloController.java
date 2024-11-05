package kr.ac.kku.cs.wp.wsd.demo;

import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	private static final Logger logger = Logger.getLogger(HelloController.class.getName());

	

	@RequestMapping("/hello")
	public ModelAndView hello(@RequestParam(name = "name", required = true) String name) {
    	final String formattedGreeting = "hello %s";
    	String greeting = String.format(formattedGreeting, name);
    
    	ModelAndView mav = new ModelAndView();
    	mav.addObject("hello", greeting);
    	mav.setViewName("HelloView");
    
    	return mav;
	}
}
