package models;

public class Room extends Services {
    private String freeServices;

    public Room(String id, String nameService, double areaUse, double priceRent,
                int maximumGuest, String typeRent, String freeServices) {
        super(id, nameService, areaUse, priceRent, maximumGuest, typeRent);
        this.freeServices = freeServices;
    }

    public Room() {
    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }

    @Override
    public void showInfo() {
        System.out.println("Thông tin thuê phòng:\n"+ "ID: " + this.getId()+"\nTên dịch vụ: " + this.getNameService()
                + "\nDiện tích: " + this.getAreaUse() + "\nGiá thuê: "+ this.getPriceRent() + "\nSố lượng khách tối đa: "
                + this.getMaximumGuest() + "\nKiểu thuê: " + this.getTypeRent() + "\nCác dịch vụ miễn phí: " + this.getFreeServices());
    }
}
