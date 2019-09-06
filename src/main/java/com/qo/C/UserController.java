package com.qo.C;

import com.qo.respo.UserRespo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
/*import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;*/
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import com.qo.m.Users;
import com.qo.s.UserService;

import java.util.List;


@Controller
public class UserController {

	@Autowired
	UserRespo userrespo;


	@Autowired
	 UserService userservice;

	
	/*
	 * @Autowired private BCryptPasswordEncoder encoder;
	 * 
	 * 
	 * public static String encrytePassword(String password) { BCryptPasswordEncoder
	 * encoder = new BCryptPasswordEncoder(); return encoder.encode(password); }
	 */


	

	@RequestMapping("/login")
	public String ll() 
	{
		
		return"login";
	}
	

	@RequestMapping("users")
	public String index()
	{

		return"redirect:/viewuser";
	}


	@RequestMapping("/addusers")
	public String adduser()
	{
		
		return"Usersa";
		
	}
	
	
	@RequestMapping("/saveuser")
	public String saveUser(@ModelAttribute("user")Users user,ModelMap modelMap) {

		/* user.setPassword(encoder.encode(user.getPassword())); */

	userservice.saveuser(user);

	return"redirect:viewuser";
	}
	
	
  	@RequestMapping("/viewuser")
	public String viewusers(ModelMap modelmap) {
	  List<Users> user = userservice.getallusers();
     modelmap.addAttribute("user", user);
	  return "Users2";
  	}


	@RequestMapping("/editusers")
  	public String Edit(ModelMap modelmap, @RequestParam("id") int a)
  	{

  	Users user=  userservice.getbyid(a);

	  modelmap.addAttribute("user",user);


  	return"Users3";
  	}

  	@RequestMapping("/deleteusers")
  	public String delete(@RequestParam("id")int b)
  	{
  	Users user=userservice.getbyid(b);
  	userservice.deleteuser(user);


  	return "redirect:/viewuser";
  	}


 	@RequestMapping(value = "/savelogin",method = RequestMethod.POST)
	public String login(@RequestParam("email") String email,@RequestParam("password")String passwrd ,ModelMap modelmap) {

 		
 		Users user=userrespo.findByEmail(email);

 	       /*String a =  encoder.encode(password);*/
              	 	
	 	if(user.getPassword().equals(passwrd) )
		{

			return"redirect:/viewuniversity";
		}

	 	else {


			modelmap.addAttribute("msg", "invalid email or paasword");
		}
	 	return"login";



	 }













}
