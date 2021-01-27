package model;

public class Customer implements Comparable<Customer> {

    private String idCus;
    private String nameCus;
    private String birthDay;
    private String gender;
    private String passPort;
    private String telephoneNumber;
    private String emailCus;
    private String typeCus;
    private String addressCus;
    private Service service;

    public String getIdCus() {
        return idCus;
    }

    public void setIdCus(String idCus) {
        this.idCus = idCus;
    }

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

    public String getAddressCus() {
        return addressCus;
    }

    public void setAddressCus(String addressCus) {
        this.addressCus = addressCus;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Customer() {
    }

    public Customer(String nameCus, String birthDay, String gender, String passPort, String telephoneNumber, String emailCus, String typeCus, String addressCus, Service service) {
        this.nameCus = nameCus;
        this.birthDay = birthDay;
        this.gender = gender;
        this.passPort = passPort;
        this.telephoneNumber = telephoneNumber;
        this.emailCus = emailCus;
        this.typeCus = typeCus;
        this.addressCus = addressCus;
        this.service = service;
    }

    public Customer(String idCus, String nameCus, String birthDay, String gender, String passPort, String telephoneNumber, String emailCus, String typeCus, String addressCus) {
        this.idCus = idCus;
        this.nameCus = nameCus;
        this.birthDay = birthDay;
        this.gender = gender;
        this.passPort = passPort;
        this.telephoneNumber = telephoneNumber;
        this.emailCus = emailCus;
        this.typeCus = typeCus;
        this.addressCus = addressCus;
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
                ", andressCus='" + addressCus + '\'' +
                ", services=" + service +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        return this.getIdCus().compareTo(o.getIdCus());
    }
}
