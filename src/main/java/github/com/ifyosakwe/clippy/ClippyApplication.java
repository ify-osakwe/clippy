package github.com.ifyosakwe.clippy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class ClippyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClippyApplication.class, args);
	}

}
