package ua.lviv.iot.insurance.models;

public class Insurance {

    private String name;
    private String surname;
    private int numberOfDays;
    private String telephone;
    private InsuranceType insuranceType; 

    public Insurance() {
    }

    public Insurance(final String name, final String surname, 
    		final int numberOfDays, final String telephone, 
    		final InsuranceType insuranceType) {
        this.name = name;
        this.surname = surname;
        this.numberOfDays = numberOfDays;
        this.telephone = telephone;
        this.insuranceType = insuranceType;
    }


    @Override
    public String toString() {
        return "Insurance{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", numberOfDays=" + numberOfDays +
                ", telephone='" + telephone + '\'' +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(final int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(final String telephone) {
        this.telephone = telephone;
    }

	public InsuranceType getInsuranceType() {
		return insuranceType;
	}

	public void setInsuranceType(InsuranceType insuranceType) {
		this.insuranceType = insuranceType;
	}
}