
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddRecords
 */
@WebServlet("/AddRecords")
public class AddRecords extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddRecords() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String name = request.getParameter("clientname");
		String mail = request.getParameter("clientmail");
		String options = request.getParameter("options");
		String products = request.getParameter("products");
		int day = Integer.parseInt(request.getParameter("day"));
		String option1="Parca";
		if(options.equals(option1 )){
			day=Integer.MAX_VALUE;
		}

		InsertMaintenanceRecords objm = new InsertMaintenanceRecords();

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar = Calendar.getInstance();
		Date today = calendar.getTime();
		calendar.add(Calendar.DAY_OF_YEAR, day);
		String str_today = formatter.format(today);
		calendar.add(Calendar.DAY_OF_YEAR, day);
		Date tomorrow = calendar.getTime();
		String str_tomorrow = formatter.format(tomorrow);
		
		objm.insertRecords(name, mail, options, products, str_today, str_tomorrow);

		System.out.println("name " + name + " mail " + mail + " option1 " + options + " day: " + day);
		request.setAttribute("name", name);
		RequestDispatcher new23 = request.getRequestDispatcher("Cevap2.jsp");
		new23.forward(request, response);
	}

}
