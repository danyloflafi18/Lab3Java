package ua.lviv.iot.insurance.models;

public class Insurance {

    private String name;
    private String surname;
    private int numberOfDays;
    private String telephone;

    public Insurance() {
    }

    public Insurance(String name, String surname, int numberOfDays, String telephone) {
        this.name = name;
        this.surname = surname;
        this.numberOfDays = numberOfDays;
        this.telephone = telephone;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
