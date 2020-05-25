package service;

import model.Cities;
import model.CitiesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import repository.CitiesRepository;

import java.util.Arrays;
import java.util.List;

// ADI: dependency injection and spring context
public class CityService {
    @Autowired
    CitiesRepository citiesRepository;

    // ADI: should handle coversion between Cities and CitiesDTO
    public List<CitiesDTO> getCities() {
        // retrieve data from repository

        // convert data

        // return data
        return Arrays.asList();
    }
}
