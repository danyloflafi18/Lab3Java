package ua.lviv.iot.insurance.models;

public class Personal extends Insurance {

    private DangerLevel accident;
    private DangerLevel medicalAssistance;

    public Personal() {

    }

    public Personal(final String name, final String surname,
            final int numberOfDays, final String telephone,
            final InsuranceType insuranceType,
            final DangerLevel medicalAssistance, final DangerLevel accident) {
        super(name, surname, numberOfDays, telephone, insuranceType);
        this.medicalAssistance = medicalAssistance;
        this.accident = accident;
    }

    public final DangerLevel getAccident() {
        return accident;
    }

    public final void setAccident(final DangerLevel accident) {
        this.accident = accident;
    }

    public final DangerLevel getMedicalAssistance() {
        return medicalAssistance;
    }

    public final void setMedicalAssistance(
            final DangerLevel medicalAssistance) {
        this.medicalAssistance = medicalAssistance;
    }

    @Override
    public final String getHeaders() {
        return super.getHeaders() + "," + "Accident"
                + "," + "Medical assistance";
    }

    @Override
    public final String toCSV() {
        return super.toCSV() + "," + this.getAccident() + ","
                + this.getMedicalAssistance();
    }
}