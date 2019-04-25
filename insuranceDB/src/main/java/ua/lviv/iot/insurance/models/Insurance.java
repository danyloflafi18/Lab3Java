package ua.lviv.iot.insurance.models;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "ParentClass")
public class Insurance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private int numberOfDays;
    @Column
    private String telephone;
    @Column
    private InsuranceType insuranceType;

    public Insurance() {
        super();
    }

    public Insurance(final String name, final String surname, final int numberOfDays, final String telephone,
            final InsuranceType insuranceType) {
        this.name = name;
        this.surname = surname;
        this.numberOfDays = numberOfDays;
        this.telephone = telephone;
        this.insuranceType = insuranceType;
    }

    @Override
    public final String toString() {
        return "Insurance{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", numberOfDays=" + numberOfDays
                + ", telephone='" + telephone + '\'' + '}';
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

    public String getHeaders() {
        return "Name" + "," + "Surname" + "," + "NumberOfDays" + "," + "Telephone" + "," + "InsuranceType";
    }

    public String toCSV() {
        return this.getName() + "," + this.getSurname() + "," + this.getNumberOfDays() + "," + this.getTelephone() + ","
                + this.getInsuranceType();
    }

}
