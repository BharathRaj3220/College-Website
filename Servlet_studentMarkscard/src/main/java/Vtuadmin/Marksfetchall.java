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
@WebServlet("/marksfetchall")
public class Marksfetchall extends  HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Vtuadmindao dao=new Vtuadmindao();
	List<Studentmarkscarddto> li=dao.fetchallmarkscard();
	for(Studentmarkscarddto o:li) {
		System.out.println(o);
	}
	req.setAttribute("markscards", li);
	 RequestDispatcher rd= req.getRequestDispatcher("fetchallmarkscardUi.jsp");
	    rd.forward(req, resp);
}
}
