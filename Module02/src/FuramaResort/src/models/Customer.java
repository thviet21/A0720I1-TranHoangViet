package models;

import java.util.Comparator;

public class Customer implements Comparable<Customer> {
    private String nameCus;
    private String birthDay;
    private String gender;
    private String passPort;
    private String telephoneNumber;
    private String emailCus;
    private String typeCus;
    private String andressCus;
    private Services services;

    public String getNameCus() {
        return nameCus;
    }

    public void setNameCus(String nameCus) {
        this.nameCus = nameCus;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassPort() {
        return passPort;
    }

    public void setPassPort(String passPort) {
        this.passPort = passPort;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmailCus() {
        return emailCus;
    }

    public void setEmailCus(String emailCus) {
        this.emailCus = emailCus;
    }

    public String getTypeCus() {
        return typeCus;
    }

    public void setTypeCus(String typeCus) {
        this.typeCus = typeCus;
    }

    public String getAndressCus() {
        return andressCus;
    }

    public void setAndressCus(String andressCus) {
        this.andressCus = andressCus;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public Customer() {
    }

    public Customer(String nameCus, String birthDay, String gender, String passPort, String telephoneNumber, String emailCus, String typeCus, String andressCus, Services services) {
        this.nameCus = nameCus;
        this.birthDay = birthDay;
        this.gender = gender;
        this.passPort = passPort;
        this.telephoneNumber = telephoneNumber;
        this.emailCus = emailCus;
        this.typeCus = typeCus;
        this.andressCus = andressCus;
        this.services = services;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "nameCus='" + nameCus + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", gender='" + gender + '\'' +
                ", passPort='" + passPort + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", emailCus='" + emailCus + '\'' +
                ", typeCus='" + typeCus + '\'' +
                ", andressCus='" + andressCus + '\'' +
                ", services=" + services +
                '}';
    }
    public String showInfor(){
        return "Customer{" +
                "nameCus='" + nameCus + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", gender='" + gender + '\'' +
                ", passPort='" + passPort + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", emailCus='" + emailCus + '\'' +
                ", typeCus='" + typeCus + '\'' +
                ", andressCus='" + andressCus + '\'' +
                ", services=" + services +
                '}';
    }

    public String writeToCSV() {
        return getNameCus() + ","
                + getBirthDay() + ","
                + getGender() + ","
                + getPassPort() + ","
                + getTelephoneNumber() + ","
                + getEmailCus() + ","
                + getTypeCus() + ","
                + getAndressCus() + ","
                + (getServices() == null? null: getServices().getId());
    }



    @Override
    public int compareTo(Customer o) {
        if (this.getNameCus().compareTo(o.getNameCus())==0){
            return this.getBirthDay().compareTo(o.getBirthDay());
        }else return this.getNameCus().compareTo(o.getNameCus());
    }
}
