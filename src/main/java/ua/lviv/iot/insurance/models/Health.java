package ua.lviv.iot.insurance.models;

public class Health extends Insurance {

    private boolean prematureDeath;
    private DangerLevel accident;
    private DangerLevel invalidity;

    public Health() {
    }

    public Health(final String name,
        final String surname,
        final int numberOfDays,
        final String telephone,
        final InsuranceType insuranceType,
        final boolean prematureDeath,
        final DangerLevel accident) {
        super(name, surname, numberOfDays, telephone, insuranceType);
        this.prematureDeath = prematureDeath;
        this.accident = accident;
    }

    public final boolean isPrematureDeath() {
        return prematureDeath;
    }

    public final void setPrematureDeath(final boolean prematureDeath) {
        this.prematureDeath = prematureDeath;
    }

    public final DangerLevel getAccident() {
        return accident;
    }

    public final void setAccident(final DangerLevel accident) {
        this.accident = accident;
    }

    public final DangerLevel getInvalidity() {
        return invalidity;
    }

    public final void setInvalidity(final DangerLevel invalidity) {
        this.invalidity = invalidity;
    }
}