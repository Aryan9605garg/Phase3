package com.ecommerce.controller;

//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.ecommerce.beans.Quote;

@Controller
public class MainController {
	
    @ResponseBody
    @RequestMapping("/")
    public String index() {
    	RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("hello world", Quote.class);
           
              
      return quote.toString();
    }

}
