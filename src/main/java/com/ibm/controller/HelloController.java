package com.ibm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
 
	@RequestMapping("/hello")  
	public String display()  
	{  
	    return "hello";  
	} 
	@RequestMapping(value="/view",method=RequestMethod.GET)  
    public String redirect()  
    {  
        return "viewpage";  
    }   
	@RequestMapping(value="/helloagain",method=RequestMethod.GET)  
	public String displays()  
	{  
	    return "final";  
	} 

}
