package Vtuadmin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Vtuadmindao;
import Dto.Studentmarkscarddto;
@WebServlet("/fetchstudentmarkscardbyusn")
public class StudentMarkscardFetch extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String usn=req.getParameter("usn");
	String name=req.getParameter("name");
	
	Vtuadmindao dao=new Vtuadmindao();
	Studentmarkscarddto s1=dao.fetchmarksbyusn(usn);
	 System.out.println(s1);
	req.setAttribute("marksdata", s1);
    RequestDispatcher rd= req.getRequestDispatcher("StudentmarkscardUi.jsp");
    rd.forward(req, resp);
   
}
}
