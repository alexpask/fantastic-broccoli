package awsprog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {
	@GetMapping("/hello")
	Hello hello() {
		return new Hello("Alex");
	}
}
