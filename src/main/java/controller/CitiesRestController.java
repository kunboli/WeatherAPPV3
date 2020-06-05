package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import model.CityDTO;
import service.CityService;

@RestController
@RequestMapping("/api")
public class CitiesRestController {

//	// ADI: controller should not interact directly with repository
//	@Autowired 
//	CitiesRepository citiesRepository;
//	
//	@Autowired
//	CitiesDTORepository citiesDTORepository;

	@Autowired
	CityService cityService;



	// ADI: rename to /cities
	@GetMapping("/cities")
	public List<CityDTO> getCitiesDTO() {
		return cityService.getCities();
	}
}
