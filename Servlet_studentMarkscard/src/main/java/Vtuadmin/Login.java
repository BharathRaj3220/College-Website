package Vtuadmin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Vtuadmindao;
import Dto.Adminsinupdto;

@WebServlet("/login")
public class Login extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String logvtuid=req.getParameter("vtuid");
	String password=req.getParameter("pass");
	int logvtulid=Integer.parseInt(logvtuid);
	
	Vtuadmindao dao=new Vtuadmindao();
	Adminsinupdto a1=dao.fetch(logvtulid);
	System.out.println(a1);
	if(logvtulid==a1.getVtuid()&&password.equals(a1.getPassword())) {
		resp.sendRedirect("Adminhome.jsp");
	}else {
		resp.getWriter().print("Incorrect data entered");
	}
	
}
}
