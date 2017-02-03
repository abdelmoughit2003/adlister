import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by abdelmoughit on 2/2/2017.
 */
public class ViewAdServlet extends HttpServlet {
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {

        long id = Long.parseLong(request.getParameter("id"));
        Ads ads = DaoFactory.getAdsDao();

        Ad ad = ads.find(id);
        request.setAttribute("ad", ad);

        request.getRequestDispatcher("/WEB-INF/ads/show.jsp").forward(request, response);
    }
}
