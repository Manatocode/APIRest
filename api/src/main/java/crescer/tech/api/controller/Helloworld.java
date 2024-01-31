package crescer.tech.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Helloworld {
	
	@GetMapping
	public String olaMundo() {
		return "Hello World String";
		
		
	}

}
