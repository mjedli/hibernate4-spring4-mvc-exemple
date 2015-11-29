/**
 * 
 */
package com.parismon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author mjedli
 *
 */
@Controller
@RequestMapping("/")
public class AppController {

	@RequestMapping(value = {""} , method = RequestMethod.GET)
	public String goToRegisterPage(ModelMap modelMap) {
		return "login"; 
	}
	
	@RequestMapping(value = {""} , method = RequestMethod.POST)
	public String saveParismonUser(ModelMap modelMap) {	
		return "login"; 
	}
	
}
