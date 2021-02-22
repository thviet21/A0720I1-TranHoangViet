package models;

import java.time.LocalDate;
import java.util.Date;

public class Guest {
    String name;
    String birthday;
    String address;
    String imgsrc;

    public Guest(String name, String birthday, String address, String imgsrc) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.imgsrc = imgsrc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }

    public Guest() {
    }

    public Guest(String name, String birthday, String address) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
    }
}
