package lesson_10.task_10_2;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AgeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String ageParam = req.getParameter("age");
        if (ageParam != null) {
            try {
                int age = Integer.parseInt(ageParam);
                String result = age >= 18 ? "Совершеннолетний" : "Не совершеннолетний";

                resp.setContentType("text/plain; charset=UTF-8");
                resp.getWriter().write(result);
            } catch (NumberFormatException e) {
                resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "Возраст должен быть числом");
            }
        } else {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "Необходимо указать возраст");
        }
    }
}
