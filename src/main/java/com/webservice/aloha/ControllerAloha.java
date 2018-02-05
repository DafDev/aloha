package com.webservice.aloha;
import org.springframework.stereotype.Controller;
import  org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@Controller
public class ControllerAloha {
    @RequestMapping(value = "/sayAloha", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String sayHello() {
        return "Aloha";
    }

}
