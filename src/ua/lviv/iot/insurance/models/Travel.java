package ua.lviv.iot.insurance.models;

public class Travel extends Insurance {

    private DangerLevel medicalAssistance;
    private DangerLevel accident;

    public Travel(){

    }

    public Travel(String name, String surname, int numberOfDays, String telephone,
                  DangerLevel medicalAssistance, DangerLevel accident) {
        super(name,surname,numberOfDays,telephone);
        this.medicalAssistance = medicalAssistance;
        this.accident = accident;
    }

    public DangerLevel getMedicalAssistance() {
        return medicalAssistance;
    }

    public void setMedicalAssistance(DangerLevel medicalAssistance) {
        this.medicalAssistance = medicalAssistance;
    }

    public DangerLevel getAccident() {
        return accident;
    }

    public void setAccident(DangerLevel accident) {
        this.accident = accident;
    }
}
