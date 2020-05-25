package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Cities;
import model.CitiesDTO;
import repository.CitiesDTORepository;
import repository.CitiesRepository;
import service.CityService;

@RestController
@RequestMapping("/api")
public class CitiesRestController {

	// ADI: controller should not interact directly with repository
	@Autowired 
	CitiesRepository citiesRepository;
	
	@Autowired
	CitiesDTORepository citiesDTORepository;

	@Autowired
	CityService cityService;

	// ADI: we dont need this
	@GetMapping("/cities")
	public List<Cities>  getCities() {
		return (List<Cities>) citiesRepository.findAll();
	}

	// ADI: rename to /cities
	@GetMapping("/citiesDTO")
	public List<CitiesDTO> getCitiesDTO() {
		return cityService.getCities();
	}
}
