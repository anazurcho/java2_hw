package ge.edu.btu.ana.zurabashvili.regform;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/userservlet")
public class userservlet extends HttpServlet{
    public static final String VIEW = "/showUser.jsp";
    Pet pet=new Pet();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("pet",pet);

        RequestDispatcher view = req.getRequestDispatcher(VIEW);
        view.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        pet.setName(req.getParameter("name"));
        pet.setVariety(req.getParameter("variety"));
        pet.setGender(req.getParameter("gender"));
        pet.setAge(req.getParameter("age"));

        System.out.println(pet.getName());
        System.out.println(pet.getSurname());
        System.out.println(pet.setGender());
        System.out.println(pet.setAge());
    }


}
