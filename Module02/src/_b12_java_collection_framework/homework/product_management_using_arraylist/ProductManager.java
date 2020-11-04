package _b12_java_collection_framework.homework.product_management_using_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    static List<Product> productList = new ArrayList<>();
    static int choice;
    static int idProduct = 2;
    static String nameProduct;
    static long priceProduct;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        productList.add(new Product(1,"Bánh tráng",3000));
        productList.add(new Product(2,"Bánh ướt",5000));
        while (true) {
            System.out.println("1.Thêm sản phẩm\n" +
                    "2.Sửa thông tin sản phẩm theo id\n" +
                    "3.Xoá sản phẩm theo id\n" +
                    "4.Hiển thị danh sách sản phẩm\n" +
                    "5.Tìm kiếm sản phẩm theo tên\n" +
                    "6.Sắp xếp sản phẩm tăng dần, giảm dần theo giá\n" +
                    "7. Exit");
            System.out.println("Lựa chọn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    editProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    showAllProduct();
                    break;
                case 5:
                    searchProduct();
                    break;
                case 6:
                    System.out.println("Muốn sắp xếp tăng hay giảm? \n" +
                            "1. Tăng dần\n" +
                            "2. Giảm dần");
                    int sort = scanner.nextInt();
                    switch (sort){
                        case 1:
                            for (Product product : productList) {
                                System.out.println(product);
                            }
                            System.out.println("-------------");
                            break;
                        case 2:
                            for (int index = productList.size()-1 ; index >= 0 ; index--) {
                                System.out.println(productList.get(index));
                            }
                            System.out.println("-------------");
                            break;
                    }
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng nhập lại số từ 1-7");
            }
        }


    }

    public static void addProduct() {
        System.out.println("Thêm mới sản phẩm!");
        idProduct += 1;
        scanner.skip("\n");
        System.out.println("Name: ");
        nameProduct = scanner.nextLine();
        System.out.println("Price: ");
        priceProduct = scanner.nextLong();
        productList.add(new Product(idProduct, nameProduct, priceProduct));
        System.out.println("Thêm sản phẩm thành công!");
        System.out.println("_____________");
        showAllProduct();
        System.out.println("________________");
    }

    public static void editProduct() {
        System.out.println("Nhập vào id sản phẩm muốn sửa: ");
        idProduct = scanner.nextInt();
        System.out.println("Name: ");
        scanner.skip("\n");
        String nameNew = scanner.nextLine();
        System.out.println("Price: ");
        long priceNew = scanner.nextLong();
        for (Product product : productList) {
            if (idProduct == product.getIdProduct()){
                product.setNameProduct(nameNew);
                product.setPriceProduct(priceNew);
            }else {
                System.out.println("ID sản phẩm bạn nhập vào không có trong danh sách");
                break;
            }
        }
        showAllProduct();
    }

    public static void deleteProduct() {
        showAllProduct();
        System.out.println("Nhập vào id của sản phẩm muốn xóa:");
        idProduct = scanner.nextInt();
        for (Product product : productList) {
            if (idProduct == product.getIdProduct()){
                productList.remove(product);
                System.out.println("Đã xóa sp thành công");
            }else {
                System.out.println("Không có sản phẩm trong danh sách");
                System.out.println("________________");
                break;
            }
        }



    }

    public static void showAllProduct() {
        for (Product product : productList) {
            System.out.println("ID:" + product.getIdProduct() + "\n Name: " + product.getNameProduct() +
                    "\nPrice: " + product.getPriceProduct() + "\n-------------------");
        }
    }
    public static void searchProduct(){
        System.out.println("Tên sản phẩm: ");
        scanner.skip("\n");
        String nameProduct = scanner.nextLine();
        for (Product product: productList){
            if (product.getNameProduct().equalsIgnoreCase(nameProduct) ){
                System.out.println(product.toString());
                System.out.println("-------------");
            }else {
                System.out.println("Sản phẩm không tồn tại trong danh sách");
                System.out.println("-----------------");
                break;
            }
        }
    }

}
