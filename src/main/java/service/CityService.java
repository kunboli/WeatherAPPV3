package service;

import model.City;
import model.CityDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import repository.CityRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// ADI: dependency injection and spring context
@Component
public class CityService {
    @Autowired
    CityRepository cityRepository;

    // ADI: should handle conversion between Cities and CitiesDTO
    public List<CityDTO> getCities() {
    	List<City> city = (List) cityRepository.findAll();
        // retrieve data from repository
    	List<CityDTO> cityDtoList = new ArrayList<>();
    	
    	for ( City c : city ) {
    	  	CityDTO citiesDTO = new CityDTO(c.getCitiesID(), c.getName(), convertTemp(c.getTemperature()), c.getHumidity());
            // convert data

            // return data
            cityDtoList.add(citiesDTO);
    		
    	}
    	return cityDtoList;
    }
    
    public static String convertTemp(int temperature) {
		int temp = (temperature * 9 / 5) + 32;
		return Integer.toString(temp);
	}
}
