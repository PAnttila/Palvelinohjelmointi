package fi.pellikka.hello.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Tehtava2 {

	@RequestMapping("kaksi")
	@ResponseBody
	public String returnGreetingForName(@RequestParam(name ="location", 
	required=false, defaultValue="moon") String location,
	@RequestParam(name="name") String name) {
	return "Welcome to the " + location + " " + name + "!";
	}
}

// http://localhost:8080/hello?firstname=Minna&age=100
// http://localhost:8080/kaksi?location=moon&name=John
// Welcome to the moon John!
	