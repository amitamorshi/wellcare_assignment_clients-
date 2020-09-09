package io.wellcare.appstarter;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan({"io.wellcare.*"})
@EnableJpaRepositories("io.wellcare.repository")
@EntityScan("io.wellcare.model")
public class WellcareApp {

	public static void main(String[] arg) {
		SpringApplication.run(WellcareApp.class, arg);

	}

}
