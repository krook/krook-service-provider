package net.bluemix.krook.provider;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProviderServlet
 */
@WebServlet("/cors-provider")
public class CorsProviderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Access-Control-Allow-Origin", "http://krook-service-consumer.mybluemix.net");
		response.setHeader("Access-Control-Allow-Methods", "POST, GET, DELETE, PUT");
		response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Content-Type");
		response.setContentType("text/html; charset=utf-8");
		request.setAttribute("msg", "CORS");
		request.getRequestDispatcher("/WEB-INF/cors.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
