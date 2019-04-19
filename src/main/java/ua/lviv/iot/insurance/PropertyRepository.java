package ua.lviv.iot.insurance;

import org.springframework.data.repository.CrudRepository;

import ua.lviv.iot.insurance.models.Property;

public interface PropertyRepository extends CrudRepository<Property, Integer> {
}