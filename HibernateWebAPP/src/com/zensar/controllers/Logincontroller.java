package com.zensar.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zensar.daos.UserDao;
import com.zensar.daos.UserDaoImpl;
import com.zensar.entities.User;
import com.zensar.exceptions.ServiceException;
import com.zensar.services.UserService;
import com.zensar.services.UserServiceImpl;

/**
 * Servlet implementation class Logincontroller
 */
@WebServlet("/checkuser")
public class Logincontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserService userService;



	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		UserDao userdao=new UserDaoImpl();
		UserService userserv=new UserServiceImpl();
		((UserServiceImpl) userserv).setUserdao(userdao);
		setUserService(userserv);
		
	}

	public UserService getUserService() {
		return userService;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		User clientUser =new User();
		clientUser.setUsername(username);
		clientUser.setPassword(password);
		
//invoking logic of business layer in presentation layer
		
		try {
			if (userService.validateUser(clientUser)) {

				/* out.println("<p>Dear " +username+" welcome to ZEN-SHOP</p>"); */
				RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
				rd.forward(request, response);
			} else {
				out.println("<p>sorry! invalid credentials</p>");
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.include(request, response);
			}
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
