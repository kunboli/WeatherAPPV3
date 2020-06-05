package dataLoader;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import model.City;
import model.CityDTO;
import repository.CityDTORepository;
import repository.CityRepository;
import service.ConvertTempToFahrenheit;

@Component
public class DataLoader implements ApplicationRunner {
	
	ConvertTempToFahrenheit convert = new ConvertTempToFahrenheit();
	
	@Autowired
	CityRepository cityRepository;
	
	@Autowired
	CityDTORepository cityDTORepository;


	
	// ADI: use sql command to inject data
	public void run(ApplicationArguments args) throws Exception {
		
		List<City> city = (List<City>) cityRepository.findAll();
		for (City cities1 : city) {
			CityDTO cityDTO = convert.convertCitiesToCitiesDTO(cities1);
			cityDTORepository.save(cityDTO);
		}
		
	}
	
	

}
