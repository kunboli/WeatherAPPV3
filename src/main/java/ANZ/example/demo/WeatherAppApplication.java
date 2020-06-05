package ANZ.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import service.CityService;

@SpringBootApplication
@ComponentScan(basePackages = {"dataLoader", "controller"})
@EntityScan(basePackages = { "model" })
@EnableJpaRepositories(basePackages = { "repository" })
public class WeatherAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherAppApplication.class, args);
	}
	
	@Bean
	public CityService getCityService(){
		return new CityService();
	}
	

}
