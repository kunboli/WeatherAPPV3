package ANZ.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Cities;
import service.ConvertTempToFahrenheit;

class ServiceTest {
	// ADI: need to mock Repositor class when testing service class
	// take a look at Mockito
	ConvertTempToFahrenheit service = new ConvertTempToFahrenheit();
	
	@Test
	void Conversion_Fahrenheit_of_five_is_fourty_one() {
		String output = service.convertTemp(5);
		assertEquals("41", output);
	}
	
	@Test
	void Convert_temperature() {
		Cities sydney = new Cities(1, "Sydney", 5, "21");
		String output = service.convertCitiesToCitiesDTO(sydney).getTemperature();
		assertEquals("41", output);
	}

}
