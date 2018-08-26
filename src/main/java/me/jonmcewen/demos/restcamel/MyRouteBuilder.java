package me.jonmcewen.demos.restcamel;

import org.springframework.stereotype.Component;

@Component
public class MyRouteBuilder extends org.apache.camel.builder.RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("direct:my-route").routeId("my-route")
			.log("Processing ${body}")
			.transform().simple("Processed ${body}");
	}

}
