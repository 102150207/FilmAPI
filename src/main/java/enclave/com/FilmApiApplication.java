package enclave.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import enclave.com.property.FileStorageProperties;

@SpringBootApplication

@EnableConfigurationProperties({
	FileStorageProperties.class
})


public class FilmApiApplication {

	public static void main(String[] args) {
		// this is main class to start project and it help to run application
		SpringApplication.run(FilmApiApplication.class, args);
	}

}

