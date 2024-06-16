package lesson_10.task_10_1.xml;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeServlet extends HttpServlet {

    private String getTimeByZoneId(String zoneId) {
        return ZonedDateTime.now(ZoneId.of(zoneId)).format(DateTimeFormatter.ISO_ZONED_DATE_TIME);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String path = req.getServletPath();
        String time;
        switch (path) {
            case "/minsk":
                time = getTimeByZoneId("Europe/Moscow");
                break;
            case "/washington":
                time = getTimeByZoneId("America/New_York");
                break;
            case "/beijing":
                time = getTimeByZoneId("Asia/Shanghai");
                break;
            default:
                time = "Unknown";
        }
        resp.setContentType("text/plain; charset=UTF-8");
        resp.getWriter().write(time);
    }
}
