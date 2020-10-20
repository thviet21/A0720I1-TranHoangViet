package models;

public class Villa extends Services {
    private String roomStandard;
    private String descriptionRoom;
    private double areaOfPool;
    private int floor;

    public Villa(String id, String nameService, double areaUse,
                 double priceRent, int maximumGuest, String typeRent,
                 String roomStandard, String descriptionRoom, double areaOfPool, int floor) {
        super(id, nameService, areaUse, priceRent, maximumGuest, typeRent);
        this.roomStandard = roomStandard;
        this.descriptionRoom = descriptionRoom;
        this.areaOfPool = areaOfPool;
        this.floor = floor;
    }

    public Villa() {
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

    public double getAreaOfPool() {
        return areaOfPool;
    }

    public void setAreaOfPool(double areaOfPool) {
        this.areaOfPool = areaOfPool;
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
                "\nMô tả phòng: " + this.getDescriptionRoom() + "\nDiện tích hồ bơi: " + this.getAreaOfPool() + "\nSố tầng: "+
                this.getFloor());
    }
}
