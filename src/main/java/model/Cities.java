package model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;


@Component
@Entity
public class Cities {
	@Id
	private int citiesID;
	private String name;
	private int temperature;
	private String humidity;
	
	public Cities() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Cities(int citiesID, String name, int temperature, String humidity) {
		super();
		this.citiesID = citiesID;
		this.name = name;
		this.temperature = temperature;
		this.humidity = humidity;
	}



	public int getCitiesID() {
		return citiesID;
	}

	public void setCitiesID(int citiesID) {
		this.citiesID = citiesID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}


	public String getHumidity() {
		return humidity;
	}



	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}


	
	
	
}
