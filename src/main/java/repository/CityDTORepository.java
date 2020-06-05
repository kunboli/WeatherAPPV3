package repository;

import org.springframework.data.repository.CrudRepository;

import model.CityDTO;

public interface CityDTORepository extends CrudRepository<CityDTO, String> {

}
