package ua.lviv.iot.insurance.managers;

import ua.lviv.iot.insurance.models.*;

import java.util.*;
import java.text.Collator;


public class InsuranceManager {

    private List<Insurance> insurance;

    public InsuranceManager(){
    }

    public InsuranceManager(List<Insurance> insurance){
        this.insurance = insurance;
    }

    public List<Insurance> getInsurance() {
        return insurance;
    }

    public void setInsurance(List<Insurance> insurance) {
        this.insurance = insurance;
    }

    public List<Insurance> sortingBasedOnRiskReduction(boolean descending ) {
        Comparator<Insurance> comparator =
                (Insurance obj1, Insurance obj2) ->
                        Integer.compare((obj2.getNumberOfDays()),(obj1.getNumberOfDays()));
        List<Insurance> insuranceList = insurance;
        insuranceList.sort(comparator);
        return insuranceList;
    }

    public List<Insurance> sortingAlphabeticallyInAscendingOrder(boolean descending) {
        Comparator<Insurance> comparator =
                (Insurance obj1, Insurance obj2)
                        -> obj2.getName().compareTo(obj1.getName());
        List<Insurance> insuranceList = insurance;
        insuranceList.sort(comparator);
        return insuranceList;
    }

    public List<Insurance> sortingAlphabeticallyInDescendingOrder(boolean descending) {
        Comparator<Insurance> comparator =
                (Insurance obj1, Insurance obj2)
                        -> obj1.getName().compareTo(obj2.getName());
        List<Insurance> insuranceList = insurance;
        insuranceList.sort(comparator);
         return insuranceList;
    }

    public static void main(String[] args) {
        List<Insurance> insurances = new ArrayList();

        insurances.add(new Insurance("Vadym","Todorenko",6,"0961188962"));
        insurances.add(new Insurance("Petro","Sydoryk",8,"0961177543"));
        insurances.add(new Insurance("Maksym","Baran",7,"0961836299"));



        InsuranceManager manager1 = new InsuranceManager(insurances);
        List<Insurance> sortingBasedOnRiskReduction = (new InsuranceManager(insurances))
                .sortingBasedOnRiskReduction(false);
        System.out.println(sortingBasedOnRiskReduction);

        InsuranceManager manager2 = new InsuranceManager(insurances);
        List<Insurance> sortingAlphabeticallyInAscendingOrder = (new InsuranceManager(insurances))
                .sortingAlphabeticallyInAscendingOrder(false);
        System.out.println(sortingAlphabeticallyInAscendingOrder);

        InsuranceManager manager3 = new InsuranceManager(insurances);
        List<Insurance> sortingAlphabeticallyInDescendingOrder = (new InsuranceManager(insurances))
                .sortingAlphabeticallyInDescendingOrder(false);
        System.out.println(sortingAlphabeticallyInDescendingOrder);



    }
}

