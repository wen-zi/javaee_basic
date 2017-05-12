package tech.liuwen.servletcontext.exp;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetTotal extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		int total = 0;
		
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		ServletContext servletContext = this.getServletContext();
		String attribute = (String) servletContext.getAttribute("total");
		System.out.println(attribute);
		if(attribute == null){
			total = 0;
		}else{
			total = Integer.parseInt(attribute);
		}
		
		total ++;
		servletContext.setAttribute("total", total+"");
		resp.getWriter().write("您是第" + total +"位访问的用户");
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
}