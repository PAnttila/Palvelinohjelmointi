package fi.pellikka.hello.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Tehtava1 {

	@GetMapping("/")
	public String index1() {
		return "This is the main page.";
	}

	@GetMapping("/contact")
	public String index2() {
		return "This is the contact page.";
	}

}

// http://localhost:8080/