package ua.lviv.iot.insurance.managers;

import ua.lviv.iot.insurance.models.*;

import java.util.*;


public class InsuranceManager implements Sort {

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

    public List<Insurance> sortingBasedOnRiskReduction(boolean descending) {
        Comparator<Insurance> comparator =
                (Insurance obj1, Insurance obj2) ->
                        Integer.compare((obj2.getNumberOfDays()),(obj1.getNumberOfDays()));
        insurance.sort(comparator);
        return insurance;
    }

    public List<Insurance> sortingAlphabeticallyInAscendingOrder(boolean descending) {
        Comparator<Insurance> comparator =
                (Insurance obj1, Insurance obj2)
                        -> obj2.getName().compareTo(obj1.getName());
        insurance.sort(comparator);
        return insurance;
    }

    public List<Insurance> sortingAlphabeticallyInDescendingOrder(boolean descending) {
        Comparator<Insurance> comparator =
                (Insurance obj1, Insurance obj2)
                        -> obj1.getName().compareTo(obj2.getName());
        insurance.sort(comparator);
        return insurance;
    }


}

