package edu.pnu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gugudan")
public class gugudan extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String type = req.getParameter("type");
		String snum = req.getParameter("num");
		String link = "link";
		String table = "table";
		resp.setContentType("text/html; charset = utf-8");
		int num = 2;
		if (snum != null)
			num = Integer.parseInt(snum);
		if (type != null)
			String.valueOf(type);
		else 
			type = "<ul><li>";
		try (PrintWriter out = resp.getWriter();) {
			out.println("<h1>" + num + "단입니다</h1>");
			for (int j = 1; j < 10; j++) {
				int rs = num * j;
				if (type.equals(link))
					out.println("<ul><li>" + num + "*" + j + " = " + rs + "</ul></li>");
				else if (type.equals(table))
					out.println("<table border=\"1\"><tr><td>" + num + "*" + j + " = " + rs + "</td></tr></table>");	
				else 
					out.println(type + num + "*" + j + " = " + rs + "</ul></li>");
			}
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
