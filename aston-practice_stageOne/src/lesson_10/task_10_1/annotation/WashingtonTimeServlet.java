package lesson_10.task_10_1.annotation;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@WebServlet("/washington")
public class WashingtonTimeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        String time = zonedDateTime.format(DateTimeFormatter.ISO_ZONED_DATE_TIME);
        response.setContentType("text/plain; charset=UTF-8");
        response.getWriter().write(time);
    }
}
