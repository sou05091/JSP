package edu.pnu.servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet01 extends HttpServlet {

	// 1. Default Serial Version ID 추가
	private static final long serialVersionUID = 1L;

	// 2. Control + space에서 method 추가
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
		System.out.println("MyServlet01");
	}

}
