package repository;

import org.springframework.data.repository.CrudRepository;

import model.Cities;

public interface CitiesRepository extends CrudRepository<Cities, String> {

}
