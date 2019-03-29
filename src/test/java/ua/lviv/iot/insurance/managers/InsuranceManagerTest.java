package ua.lviv.iot.insurance.managers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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



    private InsuranceWriter testWriter = new InsuranceWriter();


    private List<Insurance> insurance;

    @BeforeEach
    public void setUpForHealth() {
        insurance = new ArrayList<>();
        insurance.add(
                new Health("Oleh", "Klochnyk", 7, "0934284939",
                        InsuranceType.HEALTH, false, DangerLevel.LOW));
        insurance.add(
                new Health("Yaroslav", "Klochnyk", 5, "0934284930",
                        InsuranceType.HEALTH, false, DangerLevel.LOW));
        insurance.add(
                new Health("Yaroslav", "Chuchma", 21, "0934284935",
                        InsuranceType.HEALTH, false, DangerLevel.LOW));
        insurance.add(
                new Health("Petro", "Klochnyk", 10, "0934284938",
                        InsuranceType.HEALTH, false, DangerLevel.LOW));
        insurance.add(new Health());
    }

    @BeforeEach
    public void setUpForPersonal() {
        insurance = new ArrayList<>();
        insurance.add(new Personal("Oleh", "Klochnyk",
                7, "0934284939", InsuranceType.HEALTH,
                DangerLevel.LOW, DangerLevel.LOW));
        insurance.add(new Personal("Yaroslav", "Klochnyk",
                5, "0934284930", InsuranceType.HEALTH,
                DangerLevel.LOW, DangerLevel.LOW));
        insurance.add(new Personal("Yaroslav", "Chuchma",
                21, "0934284935", InsuranceType.HEALTH,
                DangerLevel.LOW, DangerLevel.LOW));
        insurance.add(new Personal("Petro", "Klochnyk",
                10, "0934284938", InsuranceType.HEALTH,
                DangerLevel.LOW, DangerLevel.LOW));
        insurance.add(new Personal());
    }

    @BeforeEach
    public void setUpForProperty() {
        insurance = new ArrayList<>();
        insurance.add(new Property("Oleh", "Klochnyk",
                7, "0934284939", InsuranceType.HEALTH,
                DangerLevel.LOW, DangerLevel.LOW));
        insurance.add(new Property("Yaroslav", "Klochnyk",
                5, "0934284930", InsuranceType.HEALTH,
                DangerLevel.LOW, DangerLevel.LOW));
        insurance.add(new Property("Yaroslav", "Chuchma",
                21, "0934284935", InsuranceType.HEALTH,
                DangerLevel.LOW, DangerLevel.LOW));
        insurance.add(new Property("Petro", "Klochnyk",
                10, "0934284938", InsuranceType.HEALTH,
                DangerLevel.LOW, DangerLevel.LOW));
        insurance.add(new Property());
    }

    /*
     * @Test public void testSortByDays() { Assertions.assertEquals(0,
     * ((InsuranceManager) insurance) .sortingBasedOnRiskReduction(false).size());
     * 
     * }
     * 
     * @Test public void testSortByGrowth() { Assertions.assertEquals(0,
     * ((InsuranceManager) insurance)
     * .sortingAlphabeticallyInAscendingOrder(false).size());
     * 
     * }
     * 
     * @Test public void testSortByRecession() { Assertions.assertEquals(0,
     * ((InsuranceManager) insurance)
     * .sortingAlphabeticallyInDescendingOrder(true).size());
     * 
     * }
     * 
     * @Test public void testFindBy() { Assertions.assertEquals(0,
     * ((InsuranceManager) insurance) .findBy(InsuranceType.PERSONAL).size());
     * 
     * }
     */

    @Test
    public void testWriteToFile() throws IOException {
        testWriter.writeToFile(insurance);
        File file = new File("out.csv");

        Assertions.assertEquals(file.length(), 616);

        try (FileInputStream fis = new FileInputStream(file);
                InputStreamReader isr = new InputStreamReader(fis);
                BufferedReader bufReader = new BufferedReader(isr);) {
        }
    }
}
