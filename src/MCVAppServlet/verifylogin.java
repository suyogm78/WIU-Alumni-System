package MCVAppServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.ResultSet;
import java.sql.SQLException;

import MVCAppController.DB_Connection;

/**
 * Servlet implementation class verifylogin
 */
@WebServlet("/verifylogin")
public class verifylogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public verifylogin() {
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
		String password = request.getParameter("password");
		DB_Connection db = new DB_Connection();
		System.out.println("SELECT * FROM users_info WHERE username='" + username + "'");
		try
		{
			ResultSet rs =  db.s.executeQuery(" SELECT * FROM users_info WHERE username='" + username + "'");
			
			if(rs!=null)
			{
				while(rs.next())
				{
					if( (rs.getString("passid").trim()).equalsIgnoreCase(password))
					{
						response.sendRedirect("/MVCApp/Loginsuccess.jsp");
					}
				}
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
