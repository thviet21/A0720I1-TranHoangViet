package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CaculateServlet", urlPatterns = "/calculate")
public class CalculateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Double firstOperand = Double.parseDouble(request.getParameter("first-operand").trim());
        Double secondOperand = Double.parseDouble(request.getParameter("second-operand").trim());
        String operator = request.getParameter("operator");
        Double result  = null ;
        switch (operator) {
            case "+" :
                result = firstOperand + secondOperand ;
                break;
            case "-" :
                result = firstOperand - secondOperand ;
                break;
            case "*" :
                result = firstOperand * secondOperand ;
                break;
            case "/" :
                try {
                    result = firstOperand / secondOperand ;
                }catch (ArithmeticException e) {
                    e.printStackTrace();
                }
        }
        String nullString = "chuỗi rỗng";
        request.setAttribute("result",result);
        request.setAttribute("error","<h1>"+nullString+"</h1>");
        request.getRequestDispatcher("jsp/calculate.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jsp/calculate.jsp").forward(request,response);
    }
}
