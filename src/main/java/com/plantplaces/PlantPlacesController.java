package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Administrator
 *
 */
@Controller
public class PlantPlacesController {
	
	
	@RequestMapping(value = "/start", method = RequestMethod.GET)
	public String start() {
		
		return "start";
	}
	
	@RequestMapping(value = "/start", method = RequestMethod.GET, params = {"loyalty=blue"})
	public String readBlue() {
		
		return "start";
	}
	
	@RequestMapping(value = "/start", method = RequestMethod.GET, params = {"loyalty=silver"})
	public String readSilver() {
		
		return "start";
	}
	
	@RequestMapping(value = "/start", method = RequestMethod.GET, headers = {"content-type=text/json"})
	public String readJSON() {
		
		return "start";
	}
	
	@PostMapping("/start")
	public String create() {
		
		return "start";
	}
	
	@RequestMapping("/")
	public String index() {
		
		return "index";
	}
}
