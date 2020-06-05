package Mock;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import controller.CitiesRestController;
import model.City;
import model.CityDTO;
import service.CityService;

public class ServiceCitiesMockTest {
	
	
	
	@Test
	public void service_Cities_Using_A_Mock() {
		CityService mockCityService = mock(CityService.class);
		CitiesRestController controller = new CitiesRestController();		
		List<CityDTO> cityDTOList = new ArrayList<CityDTO>();		
		when(mockCityService.getCities()).thenReturn(cityDTOList);
		List<CityDTO> dtoList = controller.getCitiesDTO();
		assertEquals(cityDTOList, dtoList);
	}

}
