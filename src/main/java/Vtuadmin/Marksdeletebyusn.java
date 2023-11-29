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
@WebServlet("/marksdeletebyusn")
public class Marksdeletebyusn extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String usn=req.getParameter("usn");
	Vtuadmindao dao=new Vtuadmindao();
	String str=dao.deletemarksbyusn(usn);
	 RequestDispatcher rd= req.getRequestDispatcher("Adminhome.jsp");
	    rd.forward(req, resp);
}
}
