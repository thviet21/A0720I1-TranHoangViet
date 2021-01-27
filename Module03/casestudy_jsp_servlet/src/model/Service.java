package model;

public class Service {
    private int idService;
    private String nameService;
    private double areaUse;
    private int floorTotal;
    private int maximumGuest;
    private double priceRent;
    private int typeRent;
    private int typeService;
    private String statusService;

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(double areaUse) {
        this.areaUse = areaUse;
    }

    public int getFloorTotal() {
        return floorTotal;
    }

    public void setFloorTotal(int floorTotal) {
        this.floorTotal = floorTotal;
    }

    public int getMaximumGuest() {
        return maximumGuest;
    }

    public void setMaximumGuest(int maximumGuest) {
        this.maximumGuest = maximumGuest;
    }

    public double getPriceRent() {
        return priceRent;
    }

    public void setPriceRent(double priceRent) {
        this.priceRent = priceRent;
    }

    public int getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(int typeRent) {
        this.typeRent = typeRent;
    }

    public int getTypeService() {
        return typeService;
    }

    public void setTypeService(int typeService) {
        this.typeService = typeService;
    }

    public String getStatusService() {
        return statusService;
    }

    public void setStatusService(String statusService) {
        this.statusService = statusService;
    }

    public Service() {
    }

    public Service(int idService, String nameService, double areaUse, int floorTotal, int maximumGuest, double priceRent, int typeRent, int typeService, String statusService) {
        this.idService = idService;
        this.nameService = nameService;
        this.areaUse = areaUse;
        this.floorTotal = floorTotal;
        this.maximumGuest = maximumGuest;
        this.priceRent = priceRent;
        this.typeRent = typeRent;
        this.typeService = typeService;
        this.statusService = statusService;
    }

    @Override
    public String toString() {
        return "Services{" +
                "id=" + idService +
                ", nameService='" + nameService + '\'' +
                ", areaUse=" + areaUse +
                ", floorTotal=" + floorTotal +
                ", maximumGuest=" + maximumGuest +
                ", priceRent=" + priceRent +
                ", typeRent=" + typeRent +
                ", typeService=" + typeService +
                ", statusService='" + statusService + '\'' +
                '}';
    }
}
