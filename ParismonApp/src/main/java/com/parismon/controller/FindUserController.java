/**
 * 
 */
package com.parismon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping(value="/findUserById")
public class FindUserController {

	@Autowired
	ParismonUserService service;
	
	@Autowired
	MessageSource messageSource;
	
	
	@RequestMapping (value={""} , method=RequestMethod.GET)
	public String findUserById(ModelMap modelMap) {
		return "findUserById";
	}
	
	@RequestMapping (value={""} , method=RequestMethod.POST , params = {"id"})
	public String findUserById(
			@RequestParam (value="id") int id, 
			ModelMap modelMap) {
		ParismonUser parismonUser = service.findById(id);
		modelMap.addAttribute("parismonUser", parismonUser);
		return "findUserById";
	}
	
	
}
