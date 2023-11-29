package Vtuadmin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Vtuadmindao;
import Dto.Studentmarkscarddto;
@WebServlet("/marksfetchbyusn")
public class Marksfetchbyusn extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String usn=req.getParameter("usn");
	Vtuadmindao dao=new Vtuadmindao();
	Studentmarkscarddto s1=dao.fetchmarksbyusn(usn);
	req.setAttribute("marksdata", s1);
    RequestDispatcher rd= req.getRequestDispatcher("markscardUi.jsp");
    rd.forward(req, resp);
}
}
