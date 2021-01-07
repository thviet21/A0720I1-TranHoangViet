package controller;

import model.Product;

import java.util.Comparator;

public class ComparatorProduct implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getIdProduct()-o2.getIdProduct();
    }
}
