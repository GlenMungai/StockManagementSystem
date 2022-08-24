package com.stock.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stock.dao.ProductsDao;
import com.stock.dao.UsersDao;
import com.stock.model.Products;
import com.stock.model.Users;

/**
 * Servlet implementation class ProductsServlet
 */
@WebServlet("/addStock")
public class ProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private ProductsDao productsDao = new ProductsDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductsServlet() {
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
		
		String productName = request.getParameter("productName");
		String productCategory = request.getParameter("productCategory");
		String productPrice = request.getParameter("productPrice");
		
		
		Products products = new Products(productName, productCategory, productPrice);
		
		ProductsDao pDao = new ProductsDao();
		String result = pDao.insert(products);
		//response.getWriter().print(result);
		response.sendRedirect("AddProduct.jsp");
	}

}
