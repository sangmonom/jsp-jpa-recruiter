package com.recruitment.team.controller;

import java.io.IOException;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.recruitment.team.model.entity.Login;




@WebServlet({"/login"})
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		EntityManagerFactory EMF=null;
		Object obj=getServletContext().getAttribute("emf");//application scope
		if(obj==null) {
		EMF=Persistence.createEntityManagerFactory("jsp-jpa-recruiter");
		getServletContext().setAttribute("emf", EMF);
		}else {
			EMF=(EntityManagerFactory) obj;
		}
		
		
	}
	@Override
	public void destroy() {
		EntityManagerFactory emf=(EntityManagerFactory) getServletContext().getAttribute("emf");
		if(emf!=null && emf.isOpen()) {
			emf.close();
		}
}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action=req.getServletPath();
    	if("/login".equals(action)) {
    		//get data from req
    		String email=req.getParameter("email");
    		String password=req.getParameter("password");
    		
    		//create entity obj(when edit if come with null create new obj else use data in db)
    		Login l=new Login();
    	
    		
    		//insert into db;
    		
    		//redirect page
    		
    	}
		super.doPost(req, resp);
	}
}
