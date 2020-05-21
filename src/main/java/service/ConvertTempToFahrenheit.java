package service;

import model.Cities;
import model.CitiesDTO;

public class ConvertTempToFahrenheit {
	
	
	public CitiesDTO convertCitiesToCitiesDTO(Cities cities) {
			CitiesDTO citiesDTO = new CitiesDTO(cities.getCitiesID(), cities.getName(), convertTemp(cities.getTemperature()), cities.getHumidity());
			return citiesDTO;
		}
	
	
	public String convertTemp(int temperature) {
		int temp = (temperature * 9 / 5) + 32;
		return Integer.toString(temp);
	}

}
