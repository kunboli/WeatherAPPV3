package Mock;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import controller.CitiesRestController;
import model.City;
import model.CityDTO;
import service.CityService;

public class ServiceCitiesMockTest {
	
	
	
	@Mock
	CityService mockCityService;

	@InjectMocks
	CitiesRestController controller = new CitiesRestController();
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	
	
	@Test
	public void service_Cities_Using_A_Mock() {
		ArrayList<CityDTO> cityDTOList = new ArrayList<>();
		when(mockCityService.getCities()).thenReturn(cityDTOList);
		ArrayList<CityDTO> dtoList = controller.getCitiesDTO();
		assertEquals(dtoList, cityDTOList);
	}

}
