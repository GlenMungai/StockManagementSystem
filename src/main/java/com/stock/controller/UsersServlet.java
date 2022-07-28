package com.stock.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stock.dao.UsersDao;
import com.stock.model.Users;

/**
 * Servlet implementation class UsersServlet
 */
@WebServlet("/register")
public class UsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	private UsersDao usersDao = new UsersDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		//forwards get request to Forms jsp page
	//	RequestDispatcher dispatcher = request.getRequestDispatcher("Form.jsp");
	//	dispatcher.forward(request, response);
		
		//response.sendRedirect("Form.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		Users users = new Users(firstName, lastName, username, email, password);
		
		UsersDao uDao = new UsersDao();
		String result = uDao.insert(users);
		//response.getWriter().print(result);
		response.sendRedirect("RegSuccess.jsp");
		
		
		
//		Users users = new Users();
//		users.setFirstName(firstName);
//		users.setLastName(lastName);
//		users.setUsername(username);
//		users.setEmail(email);
//		users.setPassword(password);
		
//		
//		//call usersDao method
//		try {
//			usersDao.registerUsers(users);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		//to send to jsp page
//		RequestDispatcher dispatcher = request.getRequestDispatcher("Form.jsp");
//		dispatcher.forward(request, response);
//		
		//response.sendRedirect("Form.jsp");
		
	}

}
