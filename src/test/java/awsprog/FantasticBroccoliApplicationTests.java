package awsprog;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class FantasticBroccoliApplicationTests {
	
	@LocalServerPort
	private int port;
	
	final RestTemplate template = new RestTemplate();
	
	@Test
	public void shouldReturnName() {
		// Given
		String name = "Jim";
		// When 
		Hello message = template.getForObject("http://localhost:" + port + "/hello?name=" + name, Hello.class);
		// Then
	    assertThat(message.getName(), is(name));
	}
}
