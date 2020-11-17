package models;

public abstract class Services {
    private String id;
    private String nameService;
    private double areaUse;
    private double priceRent;
    private int maximumGuest;
    private String typeRent;

    public Services(String id, String nameService, double areaUse, double priceRent, int maximumGuest, String typeRent) {
        this.id = id;
        this.nameService = nameService;
        this.areaUse = areaUse;
        this.priceRent = priceRent;
        this.maximumGuest = maximumGuest;
        this.typeRent = typeRent;
    }

    public Services() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public double getPriceRent() {
        return priceRent;
    }

    public void setPriceRent(double priceRent) {
        this.priceRent = priceRent;
    }

    public int getMaximumGuest() {
        return maximumGuest;
    }

    public void setMaximumGuest(int maximumGuest) {
        this.maximumGuest = maximumGuest;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    public abstract String writeToCSV();
    public abstract String showInfo();

    @Override
    public String toString() {
        return "Services{" +
                "id='" + id + '\'' +
                ", nameService='" + nameService + '\'' +
                ", areaUse=" + areaUse +
                ", priceRent=" + priceRent +
                ", maximumGuest=" + maximumGuest +
                ", typeRent='" + typeRent + '\'' +
                '}';
    }
}
