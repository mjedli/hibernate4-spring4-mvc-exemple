/**
 * 
 */
package com.parismon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.parismon.model.ParismonUser;
import com.parismon.service.ParismonUserService;

/**
 * @author mjedli
 *
 */
@Controller
@RequestMapping("/")
public class AppController {

	@Autowired
	ParismonUserService service;
	
	@RequestMapping(value = {"/" , ""} , method = RequestMethod.GET)
	public String goToRegisterPage(ModelMap modelMap) {
		List<ParismonUser> users = service.findAllUser();
		modelMap.addAttribute("listUser", users);
		return "login"; 
	}
	
	@RequestMapping(value = {""} , method = RequestMethod.POST)
	public String saveParismonUser(ModelMap modelMap) {	
		return "login"; 
	}
	
}
