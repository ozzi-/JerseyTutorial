package app;
import org.glassfish.jersey.server.ResourceConfig;

public class HelloWorld extends ResourceConfig {
	public HelloWorld() {
		packages("service");
	}
}