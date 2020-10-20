package models;

public class House extends Services {
    private String roomStandard;
    private String descriptionRoom;
    private int floor;

    public House(String id, String nameService, double areaUse, double priceRent,
                 int maximumGuest, String typeRent, String roomStandard, String descriptionRoom, int floor) {
        super(id, nameService, areaUse, priceRent, maximumGuest, typeRent);
        this.roomStandard = roomStandard;
        this.descriptionRoom = descriptionRoom;
        this.floor = floor;
    }

    public House() {
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getDescriptionRoom() {
        return descriptionRoom;
    }

    public void setDescriptionRoom(String descriptionRoom) {
        this.descriptionRoom = descriptionRoom;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public void showInfo() {
        System.out.println("Thông tin thuê phòng:\n"+ "ID: " + this.getId()+"\nTên dịch vụ: " + this.getNameService()
                + "\nDiện tích: " + this.getAreaUse() + "\nGiá thuê: "+ this.getPriceRent() + "\nSố lượng khách tối đa: "
                + this.getMaximumGuest() + "\nKiểu thuê: " + this.getTypeRent() + "\nTiêu chuẩn phòng: " + this.getRoomStandard()+
                "\nMô tả phòng: " + this.getDescriptionRoom()+ "\nSố tầng: "+
                this.getFloor());
    }


}
