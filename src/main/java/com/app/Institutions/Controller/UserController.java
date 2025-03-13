package com.app.Institutions.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.Institutions.Entity.User;
import com.app.Institutions.Repository.UserRepository;

@Controller
@RequestMapping("/Chandu/")
public class UserController {

	private static final String admin = "UttamKumarNarra";
	private static final String adminpassword = "Uttam@2252";

	@Autowired
	private UserRepository userRepository;

//Registration Form
	@GetMapping("/form")
	public String RegisterForm(Model model) {
		model.addAttribute("object", new User());
		return "register";
	}

//Registration form details
	@PostMapping("/insert")
	public String InsertData(@ModelAttribute("object") User user) {
		userRepository.save(user);
		return "RegisterDetails";
	}

//login page
	@GetMapping("/login")
	public String showLoginPage() {
		return "login";
	}

//Login details validation
	@PostMapping("/validate")
	public String validateUser(@RequestParam String username, @RequestParam String password, Model model) {
		Optional<User> user = userRepository.findByUsername(username);

		// Normal User Login
		if (user.isPresent() && user.get().getPassword().equals(password)) {
			model.addAttribute("username", username);
			return "userpage"; // Redirect to after-login page
		}

		// Admin Login

		if (admin.equalsIgnoreCase(username) && adminpassword.equalsIgnoreCase(password)) {
			model.addAttribute("username", username);
			return "adminpage";

		} else {
			model.addAttribute("error", "Invalid username or password");
			return "login";
		}
	}

 
	@GetMapping("/UsersDetails")
	public String showDashboard(Model model) {
		model.addAttribute("userdetails", userRepository.findAll());
		return "UsersDetails"; // After login page
	}
	
	
	@GetMapping("/Edit/{username}")
	public String EditForm(@PathVariable String username, Model model) {
		User user = userRepository.findByUsername(username).orElse(null);
		if(user != null) {
			model.addAttribute("user", user);
			return"UpdateForm";
		}
		else {
			return"redirect:/Chandu/UsersDetails";
		}
 		
	}
	
	@PostMapping("/Update")
	public String UpdatedForm(@ModelAttribute User user) {
		userRepository.save(user);
		return"redirect:/Chandu/UsersDetails";
		
	}
	
	@GetMapping("/Delete/{username}")
	public String DeleteData(@PathVariable String username) {
		Optional<User> userDelete = userRepository.findByUsername(username);
		
		if(userDelete.isPresent()) {
			userRepository.delete(userDelete.get());
		}
	 
			return"redirect:/Chandu/UsersDetails";
		 
		
	}
	
	
	
}
