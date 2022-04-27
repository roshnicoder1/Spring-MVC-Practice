# Spring-MVC-Practice
## Annotations Used

# @Controller
# @GetMapping(value= "/")
# 	@RequestMapping("/login") 
# @RequestParam("name")

Use HttpServletrequest for same work insteaed of RequestParam

we can use @RequestParam to extract query parameters, form parameters, and even files from the request.

@ Fetch value from form
```
	@RequestMapping("/login")  
    public String display(HttpServletRequest req,Model m)  
    {  
        //read the provided form data  
        String name=req.getParameter("name");  
        String pass=req.getParameter("pass");  
        if(pass.equals("admin"))  
        {  
            String msg="Hello "+ name;  
            //add a message to the model  
            m.addAttribute("message", msg);  
            return "loginsuccess";  
        }  
        else  
        {  
            String msg="Sorry "+ name+". You entered an incorrect password";  
            m.addAttribute("message", msg);  
            return "errorpage";  
        }     
    } 
```

read the provided form data   by @RequestParam instaed of HttpServletRequest
```
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
    
    ```
    
    @ Fetch value from queryparameter
    Let's say that we have an endpoint /api/foos that takes a query parameter called id:
  ```
@GetMapping("/api/foos")
@ResponseBody
public String getFoos(@RequestParam String id) {
    return "ID: " + id;
}
  ```
In this example, we used @RequestParam to extract the id query parameter.
    http://localhost:8080/spring-mvc-basics/api/foos?id=abc

ID: abc
