package Company;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReservationHandler
 */
@WebServlet("/ReservationHandler")
public class ReservationHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReservationHandler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//response.getWriter().append(request.getParameter("query"));
	
		if ((request.getParameter("type")) != null) {
			String type = (request.getParameter("type"));
			if (type.equalsIgnoreCase("hotel")) {
				response.getWriter().append("hotel selected");	
			} else if (type.equalsIgnoreCase("villa")) {
				response.getWriter().append("villa selected");	
			}
			else {
				response.getWriter().append("INvalid type");
			}
		} else {
			response.getWriter().append("No type parameter");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
