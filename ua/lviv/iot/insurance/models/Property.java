package ua.lviv.iot.insurance.models;

public class Property extends Insurance {

    private DangerLevel fireDangerLevel;
    private DangerLevel waterDangerLevel;
    private DangerLevel theftDangerLevel;


    public Property(){
    }

    public Property(String name, String surname, int numberOfDays, String telephone,
                    DangerLevel fireDangerLevel, DangerLevel waterDangerLevel, DangerLevel theftDangerLevel ){
        super(name, surname, numberOfDays, telephone);
        this.fireDangerLevel = fireDangerLevel;
        this.theftDangerLevel = theftDangerLevel;
        this.waterDangerLevel = waterDangerLevel;
    }

    public DangerLevel getFireDangerLevel() {
        return fireDangerLevel;
    }

    public void setFireDangerLevel(DangerLevel fireDangerLevel) {
        this.fireDangerLevel = fireDangerLevel;
    }

    public DangerLevel getWaterDangerLevel() {
        return waterDangerLevel;
    }

    public void setWaterDangerLevel(DangerLevel waterDangerLevel) {
        this.waterDangerLevel = waterDangerLevel;
    }

    public DangerLevel getTheftDangerLevel() {
        return theftDangerLevel;
    }

    public void setTheftDangerLevel(DangerLevel theftDangerLevel) {
        this.theftDangerLevel = theftDangerLevel;
    }
}



