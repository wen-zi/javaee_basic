package tech.liuwen;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RealPath extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		ServletContext servletContext = this.getServletContext();
		String a_realPath = servletContext.getRealPath("/a.txt");
		String b_realPath = servletContext.getRealPath("/WEB-INF/b.txt");
		String c_realPath = servletContext.getRealPath("/WEB-INF/classes/c.txt");
		System.out.println(a_realPath);
		System.out.println(b_realPath);
		System.out.println(c_realPath);
		/*
		D:\codes\javaee_basic\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\001_servlet\a.txt
		D:\codes\javaee_basic\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\001_servlet\WEB-INF\b.txt
		D:\codes\javaee_basic\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\001_servlet\WEB-INF\classes\c.txt
		*/
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
}