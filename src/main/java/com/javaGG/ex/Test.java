package com.javaGG.ex;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Text
 */
@WebServlet(urlPatterns={"/Test"}, initParams= {@WebInitParam(name="job",value="학생")})
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("EUC-KR");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String mail = request.getParameter("mail");		
		String job = request.getParameter("job");
		String job2 = getInitParameter("job");
		String protocol = request.getParameter("protocol");
		
		response.setContentType("text/html; charset=EUC-KR");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html><head></head><body>");
		writer.println("아이디 : " + id + "<br/>");
		writer.println("비밀번호 : " + pw + "<br/>");	
		writer.println("이름 : " + name + "<br/>");
		writer.println("E-mail : " + mail + "@" + protocol + "<br/>");
		if(job == "")
			writer.println("직업 : " + job2 + "<br/>");		
		else 
			writer.println("직업 : " + job + "<br/>");
		writer.println("</body></html>");		
		writer.close();
	}

}
