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

@RestController
@RequestMapping("/api")
public class CitiesRestController {
	
	@Autowired 
	CitiesRepository citiesRepository;
	
	@Autowired
	CitiesDTORepository citiesDTORepository;
	
	@GetMapping("/cities")
	public List<Cities>  getCities() {
		return (List<Cities>) citiesRepository.findAll();
	}
	
	@GetMapping("/citiesDTO")
	public List<CitiesDTO> getCitiesDTO() {
		return (List<CitiesDTO>) citiesDTORepository.findAll();
	}
}
