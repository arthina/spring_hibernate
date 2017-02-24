package com.scope.banking.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.scope.banking.entity.Customer;
import com.scope.banking.entity.State;
import com.scope.banking.services.CustomerService;

@Controller
public class WelcomeController {
	@Autowired
	@Qualifier("validator")
	private Validator validator;
	
	@Autowired
	private CustomerService customerSerice;
	
	@ModelAttribute("stateList")
	public List<State> getSateList() {
		List<State> stateList= new ArrayList<State>();
		State state=new State();
		state.setStateCode(1);
		state.setName("TamilNadu");
		stateList.add(state);
		state=new State();
		state.setStateCode(2);
		state.setName("Kerala");
		stateList.add(state);
		state=new State();
		state.setStateCode(3);
		state.setName("Karnataka");
		stateList.add(state);
		state=new State();
		state.setStateCode(4);
		state.setName("Telengana");
		stateList.add(state);
		state=new State();
		state.setStateCode(5);
		state.setName("AndhraPradesh");
		stateList.add(state);
		return stateList;
	}
	
	@InitBinder
	private void dateBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat= new SimpleDateFormat("dd-MM-yyyy");
		CustomDateEditor editor=new CustomDateEditor(dateFormat, true);
		binder.registerCustomEditor(Date.class, editor);
	}
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String welcomeMessage(ModelMap model){
		System.out.println("/index");
		model.addAttribute("message", "Welcome to SCBBankingServices");
		return "welcome";
		
	}
	
	@RequestMapping(value="/product", method=RequestMethod.GET)
	public String getProducts(ModelMap model){
		System.out.println("/product");
		model.addAttribute("productlist", "List of products...........");
		return "products";
		
	} 
	
	@RequestMapping(value="/registration.htm", method=RequestMethod.GET)
	public String getRegistrationForm(ModelMap model){
		System.out.println("/registration.htm get");
		model.addAttribute("customer", new Customer());
		model.addAttribute("form", "Loading Form...........");
		return "registration";
		
	} 
	
	@RequestMapping(value="/registration.htm", method=RequestMethod.POST)
	public ModelAndView addRegistrationForm(HttpServletRequest request, 
			HttpServletResponse response, 
			@ModelAttribute ("customer") @Valid Customer customer, BindingResult result){
		System.out.println("/registration.htm post");
		ModelAndView mav= new ModelAndView();
		
		System.out.println(customer.toString());
		validator.validate(customer, result);
		System.out.println(result);
		
		if(result.hasErrors()){
			mav.setViewName("registration");
		}else{
			customerSerice.addCustomer(customer);
			mav.addObject("message", "Thanyou! Your registration has been completed successfully.");
			mav.setViewName("successregister");
		}
		
		return mav;
		
	} 
	
	

}
