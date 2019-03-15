package ua.lviv.iot.insurance.managers;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ua.lviv.iot.insurance.models.Insurance;
import ua.lviv.iot.insurance.models.InsuranceType;

public class InsuranceManager implements SortOfMethodsInsurance {

    private List<Insurance> insurance;

    public InsuranceManager() {
    }

    public InsuranceManager(final List<Insurance> insurance) {
        this.insurance = insurance;
    }

    public final List<Insurance> getInsurance() {
        return insurance;
    }

    public final void setInsurance(final List<Insurance> insurance) {
        this.insurance = insurance;
    }

    @Override
    public final List<Insurance> sortingBasedOnRiskReduction(final boolean descending) {
        Comparator<Insurance> comparator = (Insurance obj1, Insurance obj2) -> Integer.compare(obj2.getNumberOfDays(),
                obj1.getNumberOfDays());
        insurance.sort(comparator);
        return insurance;
    }

    @Override
    public final List<Insurance> sortingAlphabeticallyInAscendingOrder(final boolean descending) {
        Comparator<Insurance> comparator = (Insurance obj1, Insurance obj2) -> obj2.getName().compareTo(obj1.getName());
        insurance.sort(comparator);
        return insurance;
    }

    @Override
    public final List<Insurance> sortingAlphabeticallyInDescendingOrder(final boolean descending) {
        Comparator<Insurance> comparator = (Insurance obj1, Insurance obj2) -> obj1.getName().compareTo(obj2.getName());
        insurance.sort(comparator);
        return insurance;
    }

    @Override
    public final List<Insurance> findBy(final InsuranceType type) {
        return insurance.stream().filter(ins -> ins.getInsuranceType() == type).collect(Collectors.toList());
    }

}
