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
        request.setCharacterEncoding("UTF-8");
        String getDisc = request.getParameter("productdesc");
        String getPrice = request.getParameter("productprice");
        String getDiscount = request.getParameter("productdiscount");

        float amountDiscount = Float.parseFloat(getPrice) * Float.parseFloat(getDiscount);
        float priceDiscounted = Float.parseFloat(getPrice) - amountDiscount;
        request.setAttribute("descProduct",getDisc);
        request.setAttribute("amountDiscount",amountDiscount);
        request.setAttribute("priceDiscountde",priceDiscounted);
        request.getRequestDispatcher("jsp/discouted-price.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jsp/index.jsp").forward(request,response);
    }
}
