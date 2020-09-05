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
		//esto solo debe aparecer en testing
		return "Hello world " + date.toString();
	}

}

@RestController
@RequestMapping("/greeting7690137664")
public class Greeting7690137664 {
	
	@GetMapping("/hello")
	public String getGreeting() {
		Date date = new Date();
		//esto solo debe aparecer en testing
		return "Hello Adderly" + date.toString();
	}

}
