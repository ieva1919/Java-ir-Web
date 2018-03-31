import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/myFirstServlet") //pirmas zingsnis apsirasyti @webservlet
public class MyFirstSetvlet extends HttpServlet {  //antras zingsnis


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { //per generate pasirenkam doGet metoda
        String name = "Ieva";
        String surname = "Sinkeviciute";

        req.setAttribute("name", name);
        req.setAttribute("surname", surname);

        req.getRequestDispatcher("myFirstJsp/jsp").forward(req, resp);
    }
}
