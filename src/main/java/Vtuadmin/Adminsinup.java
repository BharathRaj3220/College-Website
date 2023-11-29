package Vtuadmin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Vtuadmindao;
import Dto.Adminsinupdto;
@WebServlet("/adminsigin")
public class Adminsinup extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String vtuid=req.getParameter("vtuid");
	String username=req.getParameter("username");
	String designation =req.getParameter("desig");
	String password=req.getParameter("pass");
	
	int vtucid= Integer.parseInt(vtuid);
	
	Adminsinupdto dto=new Adminsinupdto();
	dto.setVtuid(vtucid);
	dto.setUsername(username);
	dto.setDesignation(designation);
	dto.setPassword(password);
	
	Vtuadmindao dao=new Vtuadmindao();
	dao.insert(dto);
	
	resp.sendRedirect("login.html");
	
}
}
