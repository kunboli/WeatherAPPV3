package repository;

import org.springframework.data.repository.CrudRepository;

import model.CitiesDTO;

public interface CitiesDTORepository extends CrudRepository<CitiesDTO, String> {

}
