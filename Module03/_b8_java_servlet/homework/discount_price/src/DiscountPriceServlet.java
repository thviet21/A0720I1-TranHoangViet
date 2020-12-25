import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountPriceServlet", urlPatterns = "/discouted-price")
public class DiscountPriceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String getDisc = request.getParameter("productdesc");
        String getPrice = request.getParameter("productprice");
        String getDiscount = request.getParameter("productdiscount");

        float amountDiscount = Float.parseFloat(getPrice) * Float.parseFloat(getDiscount);
        float priceDiscounted = Float.parseFloat(getPrice) - amountDiscount;

        PrintWriter printWriter = response.getWriter();
        printWriter.append("<html><head><title>Discount Price </title><meta charset=\"UTF-8\"></head><body>").append("<h1>Amount Discount: "
                + amountDiscount + "</h1>").append("<h1>Price After Discount: " + priceDiscounted + "</h1>").append("</body></html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
