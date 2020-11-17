package models;

public class Villa extends Services {
    private String roomStandard;
    private String descriptionRoom;
    private double areaOfPool;
    private int floor;
    private String compService;



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

    public String getCompService() {
        return compService;
    }

    public void setCompService(String compService) {
        this.compService = compService;
    }

    public Villa(String id, String nameService, double areaUse,
                 double priceRent, int maximumGuest, String typeRent,
                 String roomStandard, String descriptionRoom, double areaOfPool,
                 int floor , String compService) {
        super(id, nameService, areaUse, priceRent, maximumGuest, typeRent);
        this.roomStandard = roomStandard;
        this.descriptionRoom = descriptionRoom;
        this.areaOfPool = areaOfPool;
        this.floor = floor;
        this.compService = compService;
    }
    @Override
    public String showInfo() {
        return "Thông tin thuê phòng:\n"+ "ID: " + this.getId()+"\nTên dịch vụ: " + this.getNameService()
                + "\nDiện tích: " + this.getAreaUse() + "\nGiá thuê: "+ this.getPriceRent() + "\nSố lượng khách tối đa: "
        + this.getMaximumGuest() + "\nKiểu thuê: " + this.getTypeRent() + "\nTiêu chuẩn phòng: " + this.getRoomStandard()+
                "\nMô tả phòng: " + this.getDescriptionRoom() + "\nDiện tích hồ bơi: " + this.getAreaOfPool() + "\nSố tầng: " +
                this.getFloor();
    }

    @Override
    public String toString() {
        return "Villa{" +
                "id='" + getId() +"'"+
                ",nameService='" + getNameService() + "'"+
                ",areaUse=" + getAreaUse() +
                ",priceRent=" + getPriceRent() +
                ",maxiumGuest="+ getMaximumGuest() +
                "typeRent='" +getTypeRent() + "'"+
                "roomStandard='" + roomStandard + '\'' +
                ", descriptionRoom='" + descriptionRoom + '\'' +
                ", areaOfPool=" + areaOfPool +
                ", floor=" + floor +
                ", compService='" + compService + '\'' +
                '}';
    }


    @Override
    public String writeToCSV() {
        return getId() +
                "," + getNameService() +
                "," + getAreaUse() +
                "," + getPriceRent() +
                "," + getMaximumGuest() +
                "," + getTypeRent() +
                "," + getRoomStandard() +
                "," + getDescriptionRoom() +
                "," + getAreaOfPool() +
                "," + getFloor() +
                "," + getCompService();
    }




}
