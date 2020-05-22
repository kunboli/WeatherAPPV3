package dataLoader;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import model.Cities;
import model.CitiesDTO;
import repository.CitiesDTORepository;
import repository.CitiesRepository;
import service.ConvertTempToFahrenheit;

@Component
public class DataLoader implements ApplicationRunner {
	
	ConvertTempToFahrenheit convert = new ConvertTempToFahrenheit();
	
	@Autowired
	CitiesRepository citiesRepository;
	
	@Autowired
	CitiesDTORepository citiesDTORepository;
	
	
	
	public void run(ApplicationArguments args) throws Exception {
		Cities auckland = new Cities(001,"Auckland", 15, "63%");
		Cities sydney = new Cities(002,"Sydney", 16, "77%");
		Cities melbourne = new Cities(003, "Melbourne", 10, "94%");
		
		citiesRepository.save(auckland);
		citiesRepository.save(sydney);
		citiesRepository.save(melbourne);
		
		List<Cities> cities = (List<Cities>) citiesRepository.findAll();
		for (Cities cities1 : cities) {
			CitiesDTO citiesDTO = convert.convertCitiesToCitiesDTO(cities1);
			citiesDTORepository.save(citiesDTO);
		}
		
	}
	
	

}
