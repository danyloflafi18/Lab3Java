package ua.lviv.iot.insurance;

import java.util.Optional;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.insurance.models.Property;

@RestController
@RequestMapping("/insurance")
public class PropertyController {

    @Autowired
    PropertyRepository repository;

    @GetMapping
    public Iterable<Property> getAllInsurance() {
        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Property getInsuranceById(@NotNull @PathVariable Integer id) {
        Optional<Property> foundObject = repository.findById(id);
        if (foundObject.isPresent()) {
            return foundObject.get();
        } else {
            return new Property();
        }
    }

    @PostMapping
    public Property add(@RequestBody Property insurance) {
        return repository.save(insurance);
    }

    @PutMapping(value = "/{id}")
    public Property update(@RequestBody Property updateInsurance, @PathVariable Integer id) {
        Optional<Property> foundObject = repository.findById(id);

        if (foundObject.isPresent()) {
            Property property = foundObject.get();
            property.setName(updateInsurance.getName());
            property.setInsuranceType(updateInsurance.getInsuranceType());
            property.setId(updateInsurance.getId());
            property.setFireDangerLevel(updateInsurance.getFireDangerLevel());
            property.setWaterDangerLevel(updateInsurance.getWaterDangerLevel());
            property.setTheftDangerLevel(updateInsurance.getTheftDangerLevel());
            return property;
        } else {
            return repository.save(updateInsurance);
        }
    }

    @DeleteMapping(value = "/{id}")
    public void deleteComposition(@PathVariable Integer id) {
        repository.deleteById(id);
    }

}
