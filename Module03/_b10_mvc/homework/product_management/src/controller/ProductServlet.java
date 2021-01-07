package controller;

import model.Product;
import service.ProductService;
import service.ProductServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/products")
public class ProductServlet extends HttpServlet {
    private ProductService productService = new ProductServiceImp();

    private void listProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        List<Product> productList = this.productService.findAll();
        productList.sort(new ComparatorProduct());
        request.setAttribute("products", productList);
        request.getRequestDispatcher("jsp/list.jsp").forward(request, response);
    }

    private void showCreateProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jsp/create.jsp").forward(request, response);
    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        int idProduct = Integer.parseInt(request.getParameter("idProduct").trim());
        String nameProduct = request.getParameter("nameProduct");
        double priceProduct = Double.parseDouble(request.getParameter("priceProduct"));
        String descProduct = request.getParameter("descProduct");
        String producer = request.getParameter("producer");
        this.productService.save(new Product(idProduct, nameProduct, priceProduct, descProduct, producer));
        listProduct(request, response);
    }

    private void viewProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.findById(id);
        request.setAttribute("product", product);
        request.getRequestDispatcher("jsp/view.jsp").forward(request, response);
    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
//        Product product = this.productService.findById(id);
        this.productService.remove(id);
        listProduct(request, response);
    }

    private void showEditProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Product product = this.productService.findById(Integer.parseInt(request.getParameter("id")));
        request.setAttribute("product", product);
        request.getRequestDispatcher("jsp/edit.jsp").forward(request, response);
    }

    private void editProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("idProduct"));
        String name = request.getParameter("nameProduct");
        double price = Double.parseDouble(request.getParameter("priceProduct"));
        String desc = request.getParameter("descProduct");
        String producer = request.getParameter("producer");
        this.productService.update(id, new Product(id, name, price, desc, producer));
        listProduct(request, response);
    }

    private void searchProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nameProduct = request.getParameter("search");
        String massage;
        List<Product> productLists = this.productService.findByName(nameProduct);
        if (productLists.isEmpty()) {
            massage = "Không tồn tại tên sản phẩm như mong đợi! Vui lòng tìm kiếm lại";
            request.setAttribute("massage", massage);
        }
        request.setAttribute("productLists", productLists);
        request.getRequestDispatcher("jsp/search.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createProduct(request, response);
                break;
            case "edit":
                editProduct(request, response);
                break;
            case "delete":
                deleteProduct(request, response);
                break;
            case "search":
                searchProduct(request, response);
                break;
            default:
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateProduct(request, response);
                break;
            case "view":
                viewProduct(request, response);
                break;
            case "edit":
                showEditProduct(request, response);
                break;
            case "delete":
                deleteProduct(request, response);
                break;
            default:
                listProduct(request, response);
                break;
        }
        request.getRequestDispatcher("jsp/list.jsp").forward(request, response);
    }
}
