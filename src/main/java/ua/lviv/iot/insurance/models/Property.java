package ua.lviv.iot.insurance.models;

public class Property extends Insurance {

    private DangerLevel fireDangerLevel;
    private DangerLevel waterDangerLevel;
    private DangerLevel theftDangerLevel;

    public Property() {
    }

    public Property(final String name, final String surname,
            final int numberOfDays, final String telephone,
            final InsuranceType insuranceType,
            final DangerLevel fireDangerLevel,
            final DangerLevel waterDangerLevel) {
        super(name, surname, numberOfDays, telephone, insuranceType);
        this.fireDangerLevel = fireDangerLevel;
        this.waterDangerLevel = waterDangerLevel;
    }

    public final DangerLevel getFireDangerLevel() {
        return fireDangerLevel;
    }

    public final void setFireDangerLevel(final DangerLevel fireDangerLevel) {
        this.fireDangerLevel = fireDangerLevel;
    }

    public final DangerLevel getWaterDangerLevel() {
        return waterDangerLevel;
    }

    public final void setWaterDangerLevel(final DangerLevel waterDangerLevel) {
        this.waterDangerLevel = waterDangerLevel;
    }

    public final DangerLevel getTheftDangerLevel() {
        return theftDangerLevel;
    }

    public final void setTheftDangerLevel(final DangerLevel theftDangerLevel) {
        this.theftDangerLevel = theftDangerLevel;
    }

    @Override
    public final String getHeaders() {
        return super.getHeaders() + "," + "Fire danger level" + ","
                + "Water danger level" + "," + "Theft danger level";
    }

    @Override
    public final String toCSV() {
        return super.toCSV() + "," + this.getFireDangerLevel() + ","
                + this.getWaterDangerLevel() + "," + this.getTheftDangerLevel();
    }
}
