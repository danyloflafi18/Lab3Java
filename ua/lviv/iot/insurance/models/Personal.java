package ua.lviv.iot.insurance.models;

public class Personal extends Insurance {

    private DangerLevel accident;
    private DangerLevel medicalAssistance;

    public Personal(){

    }

    public Personal(String name, String surname, int numberOfDays, String telephone,
                    DangerLevel medicalAssistance, DangerLevel accident){
        super(name,surname,numberOfDays,telephone);


    }

    public DangerLevel getAccident() {
        return accident;
    }

    public void setAccident(DangerLevel accident) {
        this.accident = accident;
    }

    public DangerLevel getMedicalAssistance() {
        return medicalAssistance;
    }

    public void setMedicalAssistance(DangerLevel medicalAssistance) {
        this.medicalAssistance = medicalAssistance;
    }
}
