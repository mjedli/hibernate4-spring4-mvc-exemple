/**
 * 
 */
package com.parismon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.parismon.model.ParismonUser;
import com.parismon.service.ParismonUserService;

/**
 * @author mjedli
 *
 */
@Controller
@RequestMapping("/register")
public class RegisterController {

	@Autowired
	ParismonUserService service;
	
	@Autowired
	MessageSource messageSource;
	
	
	@RequestMapping(value = {""} , method = RequestMethod.GET)
	public String goToRegisterPage(ModelMap modelMap) {
		return "register"; 
	}
	
	@RequestMapping(value = {""} , method = RequestMethod.POST,
			params = {"lastname", "firstname", "email", "password"})
	public String saveUserParismon(
			@RequestParam(value="lastname") String lastname,
			@RequestParam(value="firstname") String firstname,
			@RequestParam(value="email") String email,
			@RequestParam(value="password") String password
			) {

		ParismonUser parismonUser = new ParismonUser();
		parismonUser.setFirstname(firstname);
		parismonUser.setLastname(lastname);
		parismonUser.setEmail(email);
		parismonUser.setPassword(password);

		service.saveUser(parismonUser);
		
		return "register"; 
	}
	
}

