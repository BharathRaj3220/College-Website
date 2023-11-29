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
@WebServlet("/marksdeleteall")
public class marksdeleteall extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Vtuadmindao dao=new Vtuadmindao();
	String str=dao.deleteallmarkscard();
	 RequestDispatcher rd= req.getRequestDispatcher("Adminhome.jsp");
	    rd.forward(req, resp);
}
}
