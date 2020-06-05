package service;

import model.City;
import model.CityDTO;

public class ConvertTempToFahrenheit {

	public CityDTO convertCitiesToCitiesDTO(City cities) {
			CityDTO citiesDTO = new CityDTO(cities.getCitiesID(), cities.getName(), convertTemp(cities.getTemperature()), cities.getHumidity());
			return citiesDTO;
		}
	
	
	public static String convertTemp(int temperature) {
		int temp = (temperature * 9 / 5) + 32;
		return Integer.toString(temp);
	}

}
