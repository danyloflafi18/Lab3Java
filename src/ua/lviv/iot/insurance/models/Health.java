package ua.lviv.iot.insurance.models;

public class Health extends Insurance{

    private boolean prematureDeath;
    private DangerLevel accident;
    private DangerLevel invalidity;

    public Health(){
    }

    public Health(String name, String surname, int numberOfDays, String telephone,
                  boolean prematureDeath, DangerLevel accident,DangerLevel invalidity){
        super(name,surname,numberOfDays,telephone);
        this.prematureDeath = prematureDeath;
        this.accident = accident;
        this.invalidity = invalidity;
    }

    public boolean isPrematureDeath() {
        return prematureDeath;
    }

    public void setPrematureDeath(boolean prematureDeath) {
        this.prematureDeath = prematureDeath;
    }

    public DangerLevel getAccident() {
        return accident;
    }

    public void setAccident(DangerLevel accident) {
        this.accident = accident;
    }

    public DangerLevel getInvalidity() {
        return invalidity;
    }

    public void setInvalidity(DangerLevel invalidity) {
        this.invalidity = invalidity;
    }
}
