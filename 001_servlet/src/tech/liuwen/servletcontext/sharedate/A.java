package tech.liuwen.servletcontext.sharedate;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class A extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		//在一个servlet中存入数据，在另外一个servlet中获取数据
		//servletContext的生命周期决定了它可以用于共享数据
		ServletContext servletContext = this.getServletContext();
		servletContext.setAttribute("name", "lw");
		
		resp.getWriter().write("A执行完毕，已经写入数据到servletContext");
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
}