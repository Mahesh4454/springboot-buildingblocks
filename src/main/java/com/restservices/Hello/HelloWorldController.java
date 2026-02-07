package com.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	//@RequestMapping(method = RequestMethod.GET, path="/helloworld")
	@GetMapping("/helloworld")
	public String helloWorld()
	{
		return "Hello world1";
	}
	@GetMapping("/userDetails")
	public UserDetails helloWorldBean()
	{
		return new UserDetails("Mahesh","Thallapalli","Anantapur");
	}
}
