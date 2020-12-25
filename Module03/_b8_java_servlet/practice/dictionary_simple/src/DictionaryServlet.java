import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@WebServlet(name = "DictionaryServlet", urlPatterns = "/dictionary")
public class DictionaryServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] stringsEnglish = {"England","China","America","Vietnam"};
        String[] stringsVietnam = {"Anh","Trung Quốc","Hoa kỳ","Việt Nam"};

        String input = request.getParameter("txtSearch");
        int getIndex = findIndex(stringsEnglish,input);
        String output;
        PrintWriter printWriter = response.getWriter();
        printWriter.append("<html>");
        if (getIndex>=0){
            output= stringsVietnam[getIndex];
            printWriter.append("<h1>Input: "+input +"</h1><br>").append("<h1>Output: "+output+"</h1>");
        }else {
            printWriter.append("<h1>Input: "+input +" Not found</h1>");
        }
        printWriter.append("</html>");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    public static int findIndex(String[] array,String input){
        int index;
        for ( index= 0; index < array.length; index++) {
            if(input.equals(array[index])){
                return index;
            }
        }
        return -1;
    }
}
