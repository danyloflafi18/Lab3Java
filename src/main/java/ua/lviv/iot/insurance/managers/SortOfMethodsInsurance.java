package ua.lviv.iot.insurance.managers;

import java.util.List;

import ua.lviv.iot.insurance.models.Insurance;
import ua.lviv.iot.insurance.models.InsuranceType;

public interface SortOfMethodsInsurance {
    List<Insurance> sortingBasedOnRiskReduction(boolean descending);

    List<Insurance> sortingAlphabeticallyInAscendingOrder(boolean descending);

    List<Insurance> sortingAlphabeticallyInDescendingOrder(boolean descending);

    List<Insurance> findBy(InsuranceType type);

    void addInsurance(Insurance insurance);
}