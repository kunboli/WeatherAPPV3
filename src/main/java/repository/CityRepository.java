package repository;

import org.springframework.data.repository.CrudRepository;

import model.City;

public interface CityRepository extends CrudRepository<City, String> {

}
