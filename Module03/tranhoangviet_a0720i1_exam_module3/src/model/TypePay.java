package model;

public class TypePay {
    private int idPay;
    private String namePay;

    public TypePay(int idPay, String namePay) {
        this.idPay = idPay;
        this.namePay = namePay;
    }

    public TypePay() {
    }

    public int getIdPay() {
        return idPay;
    }

    public void setIdPay(int idPay) {
        this.idPay = idPay;
    }

    public String getNamePay() {
        return namePay;
    }

    public void setNamePay(String namePay) {
        this.namePay = namePay;
    }
}
