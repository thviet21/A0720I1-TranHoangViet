package _b12_java_collection_framework.homework.product_management_using_arraylist;

public class Product {
    private int idProduct;
    private String nameProduct;
    private long priceProduct;

    public Product(int idProduct, String nameProduct, long priceProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    public Product() {
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public long getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(long priceProduct) {
        this.priceProduct = priceProduct;
    }

    @Override
    public String toString() {
        return  "ID sản phẩm: " + idProduct +
                ", Tên sản phẩm: '" + nameProduct + '\'' +
                ", Giá sản phẩm: " + priceProduct;
    }
}
