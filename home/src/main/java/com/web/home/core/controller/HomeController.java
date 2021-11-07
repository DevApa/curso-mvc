package com.web.home.core.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.web.home.models.domain.Usuario;

@Controller
public class HomeController {
	
	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("usuario", "Carlos Aparicio");
		model.addAttribute("titulo", "home");
		return "index";
	}
	
	@GetMapping({"", "/login"})
	public String getLogin(Model model) {
		Usuario usuario = new Usuario();
		model.addAttribute("titulo", "Login");
		model.addAttribute("usuario", usuario);
		return "login";
	}
	
	@PostMapping("/login")
	public String  login(@Valid Usuario usuario, BindingResult result, Model model) {
		model.addAttribute("titulo", "Resultado ingreso");
		
		if (result.hasErrors()) {
			
			return "login";
		}
				
		model.addAttribute("usuario", usuario);
		return "result";
	}
	
	@GetMapping("/register")
	public String  getRegister(Model model) {
		Usuario usuario = new Usuario();
		model.addAttribute("titulo", "Registrar");
		model.addAttribute("usuario", usuario);		
		return "register";
	}
	
	@PostMapping("/register")
	public String  register(@Valid Usuario usuario, BindingResult result, Model model) {
		model.addAttribute("titulo", "Usuario Registrado");
		
		if (result.hasErrors()) {			
			return "register";
		}
				
		model.addAttribute("usuario", usuario);
		return "result";
	}
}
