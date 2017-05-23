package awsprog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {
	@GetMapping("/hello")
	Hello hello(@RequestParam(defaultValue = "Alex")String name) {
		return new Hello(name);
	}
}
