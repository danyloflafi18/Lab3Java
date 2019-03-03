package ua.lviv.iot.insurance.models;
import ua.lviv.iot.insurance.managers.InsuranceManager;
import java.util.List;
import java.util.ArrayList;

public class MainOfInsurance {

    public static void main (final String[] args) {
        List<Insurance> insurances = new ArrayList<>();

        insurances.add(new Insurance("Vadym","Todorenko",6,"0961188962",InsuranceType.HEALTH));  
        insurances.add(new Insurance("Petro","Sydoryk",8,"0961177543",InsuranceType.PERSONAL));
        insurances.add(new Insurance("Maksym","Baran",7,"0961836299",InsuranceType.PROPERTY));

        InsuranceManager manager = new InsuranceManager(insurances);
        List<Insurance> findBy = manager
        		.findBy(InsuranceType.PERSONAL);
        System.out.println(findBy);
        
        List<Insurance> sortingBasedOnRiskReduction = manager
        		.sortingBasedOnRiskReduction(false);
        System.out.println(sortingBasedOnRiskReduction);

        List<Insurance> sortingAlphabeticallyInAscendingOrder = manager
        		.sortingAlphabeticallyInAscendingOrder(false);
        System.out.println(sortingAlphabeticallyInAscendingOrder);

        List<Insurance> sortingAlphabeticallyInDescendingOrder = manager
        		.sortingAlphabeticallyInDescendingOrder(false);
        System.out.println(sortingAlphabeticallyInDescendingOrder);
    }
}