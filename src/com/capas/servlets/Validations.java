package com.capas.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AnotacionServlet
 */
@WebServlet("/Validations")
public class Validations extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String USER="petrlr14";
	private static final String PASSWORD="nayicMatus";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Validations() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		pw.println("<body><h1>Llego</h1></body>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=request.getParameter("username"), password=request.getParameter("password");
		PrintWriter pw=response.getWriter();
		pw.println("<body><h1>");
		pw.println(username.trim().equals(USER)&&password.trim().equals(PASSWORD)?"EXITO":"ACCESO DENEGADO");
		pw.println("</h1></body>");
	}

}
