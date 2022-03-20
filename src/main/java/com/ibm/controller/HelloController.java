package com.ibm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	
//	@RequestMapping("/login")  
//    public String display(HttpServletRequest req,Model m)  
//    {  
//        //read the provided form data  
//        String name=req.getParameter("name");  
//        String pass=req.getParameter("pass");  
//        if(pass.equals("admin"))  
//        {  
//            String msg="Hello "+ name;  
//            //add a message to the model  
//            m.addAttribute("message", msg);  
//            return "loginsuccess";  
//        }  
//        else  
//        {  
//            String msg="Sorry "+ name+". You entered an incorrect password";  
//            m.addAttribute("message", msg);  
//            return "errorpage";  
//        }     
//    }  
	//read the provided form data   by @RequestParam instaed of HttpServletRequest
	@RequestMapping("/login") 
    public String display(@RequestParam("name") String name,@RequestParam("pass") String pass,Model m)  
    {  
        if(pass.equals("admin"))  
        {  
            String msg="Hello "+ name;  
            //add a message to the model  
            m.addAttribute("message", msg);  
            return "viewpage";  
        }  
        else  
        {  
            String msg="Sorry "+ name+". You entered an incorrect password";  
            m.addAttribute("message", msg);  
            return "errorpage";  
        }     
    }  

}
