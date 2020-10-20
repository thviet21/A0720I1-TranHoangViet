package models;

public class Main {
    public static void main(String[] args) {
        Villa villa = new Villa("VL001","Thuê Villa",300,800,20,"Theo ngày","*****","Là căn villa nằm ở địa thế đắt địa, view biển,...",200,3);
        System.out.println("Villa");
        villa.showInfo();
        System.out.println("-------------");
        House house = new House("H002","Thuê House",100,700,10,"Ngày","House","Mô tả phòng nè: hihihi",2);
        System.out.println("House");
        house.showInfo();
        System.out.println("-------------");
        Room room = new Room("R302","Thuê phòng",50.2,200,2,"Giờ","Nước lọc, dầu gội, kem đánh răng,...");
        System.out.println("Room");
        room.showInfo();
    }
}
