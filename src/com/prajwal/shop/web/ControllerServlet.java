package com.prajwal.shop.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prajwal.shop.service.LoginService;

public class ControllerServlet extends HttpServlet {
	
	private LoginService loginService;
	private ItemService itemService;
	
	@Override
	public void init() throws ServletException {
		loginService= new LoginService();
		itemService=new ItemService();		
	}	
	

	

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nextPage="/login.jsp";
		String page= request.getParameter("page");

		System.out.print("Checking login username and password A page: " + page);
		String action= request.getParameter("action"); //every button click is action

		System.out.print("Checking login username and password A action: " + action + " hahahahaha " );
		if(page!=null) {
			if(page.equals("login")) {
				if(action.equals("login")) {
					String username=request.getParameter("username");
					String password=request.getParameter("password");
					System.out.print("Checking login username and password B");
					boolean isValidUser=loginService.authenticate(username,password);
					if(isValidUser) {
						nextPage="/items.jsp";
						request.setAttribute("items",  itemService.fetchAll());
						
					}else {
						nextPage="/login.jsp";
						request.setAttribute("loginError", "Invalid username or password");
					}
					
				}
			}
			
		}
		
	RequestDispatcher rd=request.getRequestDispatcher(nextPage);//rd is object of RequestDispatcher class
		rd.forward(request,response);
		
	
	
	
	}

	

}
