package model;

import java.util.Date;

public class Person {
    private String fullName;
    private String address;
    private Date birthday;

    public Person() {

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Person(String fullName, String address, Date birthday) {
        this.fullName = fullName;
        this.address = address;
        this.birthday = birthday;
    }
    public int getAge(){
        Date currentDay = new Date();
        return currentDay.getYear() - this.birthday.getYear();
    }

    public Person(String fullName, String address) {
        this.fullName = fullName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
