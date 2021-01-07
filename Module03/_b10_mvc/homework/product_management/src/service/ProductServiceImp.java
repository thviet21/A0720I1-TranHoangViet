package service;

import model.Product;

import java.util.*;

public class ProductServiceImp implements ProductService {
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Sách văn lớp 1", 60000, "Là cuốn sách hướng dẫn", "NXB Giáo dục"));
        products.put(2, new Product(2, "Sách toán lớp 2", 40000, "Là cuốn sách hướng  ", "NXB Văn học"));
        products.put(3, new Product(3, "Sách lịch sử lớp 3", 22000, "Là cuốn sách ", "NXB Kim đồng"));
        products.put(4, new Product(4, "Sách văn lớp 12", 52000, "Là cuốn ", "NXB Giáo khoa"));
        products.put(5, new Product(5, "Sách văn lớp 11", 61000, "  hướng dẫn", "NXB Giáo "));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getIdProduct(),product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> productList = new ArrayList<>();
        Set<Integer> keySet = products.keySet();
        for (Integer key: keySet) {
            if (products.get(key).getNameProduct().equalsIgnoreCase(name)){
                productList.add(products.get(key));
            }
        }
        return productList;
    }
}
