package com.servlet;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.BookingBean;

@Controller
public class LoginServlet {

	@RequestMapping(value="/login" , method = RequestMethod.POST)
	public ModelAndView goToHelloPage(@RequestBody BookingBean bookingBean) {  
		ModelAndView view = new ModelAndView();  
		view.setViewName("login"); //name of the jsp-file in the "page" folder  
		if (bookingBean.getUserName().equalsIgnoreCase("Yashica") && bookingBean.getPassword().equalsIgnoreCase("Yashica")) {
			bookingBean.setContactNumber("1234556");
		} else {
			bookingBean.setError("Invalid Login");
		}
		String str = "MVC Spring is here!";  
		view.addObject("message", str); //adding of str object as "message" parameter  
		view.addObject("bookingBean", bookingBean);
		return view;  
	}  
	
	@RequestMapping("/index")
	public ModelAndView welcome(Map<String, Object> model) {
		ModelAndView view = new ModelAndView(); 
		model.put("time", new Date());
		model.put("message", "here");
		view.setViewName("index");
		return view;
	}
}