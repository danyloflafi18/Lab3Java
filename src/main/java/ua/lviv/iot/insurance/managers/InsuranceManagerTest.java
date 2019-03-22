package ua.lviv.iot.insurance.managers;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.insurance.models.DangerLevel;
import ua.lviv.iot.insurance.models.Health;
import ua.lviv.iot.insurance.models.Insurance;
import ua.lviv.iot.insurance.models.InsuranceType;
import ua.lviv.iot.insurance.models.Personal;
import ua.lviv.iot.insurance.models.Property;

class InsuranceManagerTest {

    private List<Insurance> insurance;

    private InsuranceManager insuranceManager;


    @BeforeEach
    public void setUpForHealth() {
        insuranceManager = new InsuranceManager();
        insuranceManager.addInsurance(
                new Health("Oleh", "Klochnyk", 7, "0934284939",
                        InsuranceType.HEALTH, false, DangerLevel.LOW));
        insuranceManager.addInsurance(
                new Health("Yaroslav", "Klochnyk", 5, "0934284930",
                        InsuranceType.HEALTH, false, DangerLevel.LOW));
        insuranceManager.addInsurance(
                new Health("Yaroslav", "Chuchma", 21, "0934284935",
                        InsuranceType.HEALTH, false, DangerLevel.LOW));
        insuranceManager.addInsurance(
                new Health("Petro", "Klochnyk", 10, "0934284938",
                        InsuranceType.HEALTH, false, DangerLevel.LOW));
        insuranceManager.addInsurance(new Health());
    }

    @BeforeEach
    public void setUpForPersonal() {
        insuranceManager = new InsuranceManager();
        insuranceManager.addInsurance(new Personal("Oleh", "Klochnyk", 7,
                "0934284939", InsuranceType.HEALTH, DangerLevel.LOW,
                DangerLevel.LOW));
        insuranceManager.addInsurance(new Personal("Yaroslav", "Klochnyk", 5,
                "0934284930", InsuranceType.HEALTH, DangerLevel.LOW,
                DangerLevel.LOW));
        insuranceManager.addInsurance(new Personal("Yaroslav", "Chuchma", 21,
                "0934284935", InsuranceType.HEALTH, DangerLevel.LOW,
                DangerLevel.LOW));
        insuranceManager.addInsurance(new Personal("Petro", "Klochnyk", 10,
                "0934284938", InsuranceType.HEALTH, DangerLevel.LOW,
                DangerLevel.LOW));
        insuranceManager.addInsurance(new Personal());
    }

    @BeforeEach
    public void setUpForProperty() {
        insuranceManager = new InsuranceManager();
        insuranceManager.addInsurance(new Property("Oleh", "Klochnyk", 7,
                "0934284939", InsuranceType.HEALTH,
                DangerLevel.LOW, DangerLevel.LOW));
        insuranceManager.addInsurance(new Property("Yaroslav", "Klochnyk", 5,
                "0934284930", InsuranceType.HEALTH,
                DangerLevel.LOW, DangerLevel.LOW));
        insuranceManager.addInsurance(new Property("Yaroslav", "Chuchma", 21,
                "0934284935", InsuranceType.HEALTH,
                DangerLevel.LOW, DangerLevel.LOW));
        insuranceManager.addInsurance(new Property("Petro", "Klochnyk", 10,
                "0934284938", InsuranceType.HEALTH,
                DangerLevel.LOW, DangerLevel.LOW));
        insuranceManager.addInsurance(new Property());
    }

    @Test
    public void testSortByDays() {
        Assertions.assertEquals(0, insuranceManager
                .sortingBasedOnRiskReduction(false).size());

    }

    @Test
    public void testSortByGrowth() {
        Assertions.assertEquals(0, insuranceManager
                .sortingAlphabeticallyInAscendingOrder(false).size());

    }

    @Test
    public void testSortByRecession() {
        Assertions.assertEquals(0, insuranceManager
                .sortingAlphabeticallyInDescendingOrder(true).size());

    }

    @Test
    public void testFindBy() {
        Assertions.assertEquals(0, insuranceManager
                .findBy(InsuranceType.PERSONAL).size());

    }

}
