package me.jonmcewen.demos.restcamel;

import org.apache.camel.ProducerTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	private final ProducerTemplate producerTemplate;

	public Controller(ProducerTemplate producerTemplate) {
		this.producerTemplate = producerTemplate;
	}
	
	@GetMapping("/{id}")
	public String someMethod(@PathVariable String id) {
		return producerTemplate.requestBody("direct:my-route", id, String.class);
	}

}
