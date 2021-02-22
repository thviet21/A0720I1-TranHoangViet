package model;

public class Room {
    private int idRoom;
    private String nameCustomer;
    private String telephoneNumberCustomer;
    private String startDayRent;
    private int typePay;
    private String description;

    public Room(int idRoom, String nameCustomer, String telephoneNumberCustomer, String startDayRent, int typePay, String description) {
        this.idRoom = idRoom;
        this.nameCustomer = nameCustomer;
        this.telephoneNumberCustomer = telephoneNumberCustomer;
        this.startDayRent = startDayRent;
        this.typePay = typePay;
        this.description = description;
    }

    public Room(String nameCustomer, String telephoneNumberCustomer, String startDayRent, int typePay, String description) {
        this.nameCustomer = nameCustomer;
        this.telephoneNumberCustomer = telephoneNumberCustomer;
        this.startDayRent = startDayRent;
        this.typePay = typePay;
        this.description = description;
    }

    public Room() {
    }

    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getTelephoneNumberCustomer() {
        return telephoneNumberCustomer;
    }

    public void setTelephoneNumberCustomer(String telephoneNumberCustomer) {
        this.telephoneNumberCustomer = telephoneNumberCustomer;
    }

    public String getStartDayRent() {
        return startDayRent;
    }

    public void setStartDayRent(String startDayRent) {
        this.startDayRent = startDayRent;
    }

    public int getTypePay() {
        return typePay;
    }

    public void setTypePay(int typePay) {
        this.typePay = typePay;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
