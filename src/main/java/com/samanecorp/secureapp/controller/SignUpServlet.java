package com.samanecorp.secureapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.samanecorp.secureapp.entities.AccountUserEntity;

@WebServlet(name = "signup", urlPatterns = "/signup")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SignUpServlet() {
        
    }
    
    @Override
    public void init() throws ServletException {
    	
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		AccountUserEntity model = new AccountUserEntity();
		
		model.setEmail(username);
		model.setPassword(password);
		
		request.setAttribute("account", model);
		
		request.getRequestDispatcher("welcome.jsp").forward(request, response);
		
		
	}

}
