package ua.lviv.iot.insurance.managers;

import ua.lviv.iot.insurance.models.Insurance;
import ua.lviv.iot.insurance.models.InsuranceType;

import java.util.List;

public interface SortOfMethodsInsurance {
    List<Insurance> sortingBasedOnRiskReduction(boolean descending);

    List<Insurance> sortingAlphabeticallyInAscendingOrder(boolean descending);

    List<Insurance> sortingAlphabeticallyInDescendingOrder(boolean descending);

    List<Insurance> findBy(InsuranceType type);
}
