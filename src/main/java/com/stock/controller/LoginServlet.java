package com.stock.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.stock.dao.LoginDao;
import com.stock.model.Login;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//create loginDao object
	private LoginDao loginDao;

	public void init() {
		loginDao = new LoginDao();
	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		//doGet(request, response);
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//creating a login object
		Login login = new Login();
		login.setUsername(username);
		login.setPassword(password);

		try {
			//forwarding login object to validate method
			if (loginDao.validate(login)) {
				//HttpSession session = request.getSession();
				 //session.setAttribute("username",username);
				response.sendRedirect("homepage.jsp");
			} else {
				//HttpSession session = request.getSession();
				//session.setAttribute("user", username);
				response.sendRedirect("LoginFailed.jsp");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	}


