package com.epnm.config.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZTPConfigController {
	
	 @GetMapping("/")
	    public String main() {

	        return "welcome"; //view
	    }
	
	@RequestMapping(value="/getConfig", method=RequestMethod.GET)
	public String getConfig() {
		return "Config Details are being fetched";
	}

}
