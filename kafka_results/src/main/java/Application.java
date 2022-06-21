

import java.util.function.Consumer;
import java.util.function.Supplier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public Supplier<Department> subscribeDepartmentData() {
		return () -> {
			// Add business logic here.
			return new Department();
		};
	}

	@Bean
	public Consumer<Department> publishDepartmentData() {
		return data -> {
			// Add business logic here.	
			logger.info(data.toString());
		};
	}

}
