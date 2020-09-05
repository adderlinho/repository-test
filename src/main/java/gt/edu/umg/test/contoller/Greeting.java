package gt.edu.umg.test.contoller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class Greeting {
	
	@GetMapping("/hello")
	public String getGreeting() {
		Date date = new Date();
		return "Hello world" + date.toString();
	}

}
