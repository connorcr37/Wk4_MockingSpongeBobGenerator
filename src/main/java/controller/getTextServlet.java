package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TextConverter;

/**
 * Servlet implementation class getTextServlet
 */
@WebServlet("/getTextServlet")
public class getTextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getTextServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String userText = request.getParameter("userText");
		TextConverter tc = new TextConverter(userText);
		
		request.setAttribute("text", tc);
		getServletContext().getRequestDispatcher("/converted-text.jsp").forward(request, response);
	}

}