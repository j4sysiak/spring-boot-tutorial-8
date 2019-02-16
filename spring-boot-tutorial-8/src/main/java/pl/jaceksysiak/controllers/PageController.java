package pl.jaceksysiak.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {

//	  @RequestMapping("/")
//	  String index2() {
//	    return "index2";
//	  }
	  
	  @RequestMapping("/about")
	  String about() {
	    return "about";
	  }
	  
	  @RequestMapping("/info")
	  String info() {
	    return "info";
	  }
    
	  @RequestMapping("/hello")
	  String hello() {
	    return "hello";
	  }
	  
}
