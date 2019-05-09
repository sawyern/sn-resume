package sawyern.snresume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan
@EnableConfigurationProperties
@EnableJpaRepositories
public class SnResumeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SnResumeApplication.class, args);
	}
}
