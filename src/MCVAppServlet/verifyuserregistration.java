package MCVAppServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import MVCAppController.DB_Connection;
import java.sql.SQLException;

/**
 * Servlet implementation class verifyuserregistration
 */
@WebServlet("/verifyuserregistration")
public class verifyuserregistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public verifyuserregistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("passid");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		
		DB_Connection db = new DB_Connection();
		System.out.println(" INSERT INTO users_info (username, passid, name, address, email) VALUES('" + username + "',' " + password + "','" + name + "','" + address + "','" + email + "')");
		try
		{
			int rs =  db.s.executeUpdate(" INSERT INTO users_info (username, passid, name, address, email) VALUES('" + username + "',' " + password + "','" + name + "','" + address + "','" + email + "') ");
			if(rs > 0)
			{
				response.sendRedirect("/MVCApp/Success.jsp");
			}
			else
			{
				System.out.println("prob" );
			}
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}

}
