package ua.lviv.iot.insurance.managers;

import ua.lviv.iot.insurance.models.Insurance;

import java.util.List;

public interface Sort {
    List<Insurance> sortingBasedOnRiskReduction(boolean descending );
    List<Insurance> sortingAlphabeticallyInAscendingOrder(boolean descending);
    List<Insurance> sortingAlphabeticallyInDescendingOrder(boolean descending);
}
