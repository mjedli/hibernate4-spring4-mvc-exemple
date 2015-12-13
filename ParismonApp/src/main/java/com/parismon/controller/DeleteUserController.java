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

import com.parismon.service.ParismonUserService;

/**
 * @author mjedli
 *
 */
@Controller
@RequestMapping(value="/deleteUserByEmail")
public class DeleteUserController {

	@Autowired
	ParismonUserService service;
	
	@Autowired
	MessageSource messageSource;
	
	
	@RequestMapping (value={""} , method=RequestMethod.GET)
	public String findUserById(ModelMap modelMap) {
		return "deleteUserByEmail";
	}
	
	@RequestMapping (value={""} , method=RequestMethod.POST , params = {"email"})
	public String findUserById(
			@RequestParam (value="email") String email, 
			ModelMap modelMap) {
		service.deleteUserByEmail(email);
		return "deleteUserByEmail";
	}
	
	
}
