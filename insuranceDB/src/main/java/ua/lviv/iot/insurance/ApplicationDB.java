package ua.lviv.iot.insurance;

import java.sql.SQLException;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ua.lviv.iot.insurance.models.DangerLevel;
import ua.lviv.iot.insurance.models.InsuranceType;
import ua.lviv.iot.insurance.models.Property;

@SpringBootApplication
public class ApplicationDB {

    public static void main(String[] args) throws SQLException {
        SpringApplication.run(ApplicationDB.class, args);
    }

    @Bean
    public CommandLineRunner demo(final PropertyRepository repository) {
        return (args) -> {
            repository.save(new Property("Oleh", "Klochnyk", 7, "0934284939", InsuranceType.HEALTH, DangerLevel.LOW,
                    DangerLevel.LOW));
            repository.save(new Property("Yaroslav", "Klochnyk", 5, "0934284930", InsuranceType.HEALTH, DangerLevel.LOW,
                    DangerLevel.LOW));
            repository.save(new Property("Yaroslav", "Chuchma", 21, "0934284935", InsuranceType.HEALTH, DangerLevel.LOW,
                    DangerLevel.LOW));

            repository.findAll().forEach(System.out::println);
        };
    }
}
