package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.stereotype.Component;

@Entity
@Component
// ADI: CityDTO
public class CitiesDTO {
	
	@Id
	private int citiesDTOID;
	private String name;
	private String temperature;
	private String Humidity;
	
	public CitiesDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CitiesDTO(int citiesDTOID, String name, String temperature, String humidity) {
		super();
		this.citiesDTOID = citiesDTOID;
		this.name = name;
		this.temperature = temperature;
		Humidity = humidity;
	}

	public int getCitiesDTOID() {
		return citiesDTOID;
	}

	public void setCitiesDTOID(int citiesDTOID) {
		this.citiesDTOID = citiesDTOID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getHumidity() {
		return Humidity;
	}

	public void setHumidity(String humidity) {
		Humidity = humidity;
	}
	
	
	
	

}
