package fi.pellikka.hello.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Tehtava1 {

	@GetMapping("/")
	public String index() {
		return "Tervetuloa sivulle!";
	}

}

// http://localhost:8080/