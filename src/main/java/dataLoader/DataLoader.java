package dataLoader;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import model.Cities;
import model.CitiesDTO;
import repository.CitiesDTORepository;
import repository.CitiesRepository;
import service.ConvertTempToFahrenheit;

public class DataLoader implements ApplicationRunner {
	
	ConvertTempToFahrenheit convert = new ConvertTempToFahrenheit();
	
	@Autowired
	CitiesRepository citiesRepo;
	
	@Autowired
	CitiesDTORepository citiesDTORepo;
	
	
	
	public void run(ApplicationArguments args) throws Exception {
		Cities auckland = new Cities(001,"Auckland", 15, "63%");
		Cities sydney = new Cities(002,"Sydney", 16, "77%");
		Cities melbourne = new Cities(003, "Melbourne", 10, "94%");
		
		citiesRepo.save(auckland);
		citiesRepo.save(sydney);
		citiesRepo.save(melbourne);
		
		List<Cities> cities = (List<Cities>) citiesRepo.findAll();
		for (Cities cities1 : cities) {
			CitiesDTO citiesDTO = convert.convertCitiesToCitiesDTO(cities1);
			citiesDTORepo.save(citiesDTO);
		}
		
	}
	
	

}
