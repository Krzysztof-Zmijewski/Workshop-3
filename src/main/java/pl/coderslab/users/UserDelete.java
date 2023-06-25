package pl.coderslab.users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/delete")
public class UserDelete extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        String id = req.getParameter("id");
        UserDao userDao = new UserDao();
        User read = userDao.read(Integer.parseInt(id));
        req.setAttribute("user", read);

        getServletContext().getRequestDispatcher("/users/delete.jsp")
                .forward(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        if (req.getParameter("delete") != null){
            String id = req.getParameter("id");
            UserDao userDao = new UserDao();
            User read = userDao.read(Integer.parseInt(id));
            req.setAttribute("user", read);
            userDao.delete(read.getId());
            resp.sendRedirect(req.getContextPath() + "/user/list");
        } else {
            resp.sendRedirect(req.getContextPath() + "/user/list");
        }
    }
}
