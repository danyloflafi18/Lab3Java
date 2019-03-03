package ua.lviv.iot.insurance.models;

public class Health extends Insurance {

    private boolean prematureDeath;
    private DangerLevel accident;
    private DangerLevel invalidity;

    public Health() { 
    }

    public Health(final String name, final String surname, final int numberOfDays, 
    		final String telephone, final InsuranceType insuranceType,
    		final boolean prematureDeath, final DangerLevel accident,final DangerLevel invalidity) { 
        super(name,surname,numberOfDays,telephone, insuranceType);
        this.prematureDeath = prematureDeath;
        this.accident = accident;
        this.invalidity = invalidity;
    }

    public boolean isPrematureDeath() {
        return prematureDeath;
    }

    public void setPrematureDeath(final boolean prematureDeath) {
        this.prematureDeath = prematureDeath;
    }

    public DangerLevel getAccident() {
        return accident;
    }

    public void setAccident(final DangerLevel accident) {
        this.accident = accident;
    }

    public DangerLevel getInvalidity() {
        return invalidity;
    }

    public void setInvalidity(final DangerLevel invalidity) {
        this.invalidity = invalidity;
    }
}