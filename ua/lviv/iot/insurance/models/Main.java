package ua.lviv.iot.insurance.models;
import ua.lviv.iot.insurance.managers.*;
import java.util.*;

public class Main {

    public static void main (String[] args) {
        List<Insurance> insurances = new ArrayList();

        insurances.add(new Insurance("Vadym","Todorenko",6,"0961188962"));
        insurances.add(new Insurance("Petro","Sydoryk",8,"0961177543"));
        insurances.add(new Insurance("Maksym","Baran",7,"0961836299"));



        InsuranceManager manager = new InsuranceManager(insurances);



        List<Insurance> sortingBasedOnRiskReduction = manager.sortingBasedOnRiskReduction(false);
        System.out.println(sortingBasedOnRiskReduction);


        List<Insurance> sortingAlphabeticallyInAscendingOrder = manager.sortingAlphabeticallyInAscendingOrder(false);
        System.out.println(sortingAlphabeticallyInAscendingOrder);


        List<Insurance> sortingAlphabeticallyInDescendingOrder = manager.sortingAlphabeticallyInDescendingOrder(false);
        System.out.println(sortingAlphabeticallyInDescendingOrder);



    }
}
