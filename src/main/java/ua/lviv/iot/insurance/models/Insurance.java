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
    public final String toString() {
        return "Insurance{"
                + "name='" + name + '\''
                + ", surname='" + surname + '\''
                + ", numberOfDays=" + numberOfDays
                + ", telephone='" + telephone + '\''
                + '}';
    }

	public final String getName() {
		return name;
	}

	public final void setName(final String name) {
		this.name = name;
	}

	public final String getSurname() {
		return surname;
	}

	public final void setSurname(final String surname) {
		this.surname = surname;
	}

	public final int getNumberOfDays() {
		return numberOfDays;
	}

	public final void setNumberOfDays(final int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	public final String getTelephone() {
		return telephone;
	}

	public final void setTelephone(final String telephone) {
		this.telephone = telephone;
	}

	public final InsuranceType getInsuranceType() {
		return insuranceType;
	}

	public final void setInsuranceType(final InsuranceType insuranceType) {
		this.insuranceType = insuranceType;
	}
}