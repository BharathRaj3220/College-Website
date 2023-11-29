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

@WebServlet("/markscard")
public class Markscardhandle extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String usn = req.getParameter("usn");
		String name = req.getParameter("name");
		String fathername = req.getParameter("fathername");
		String college = req.getParameter("college");
		String slno = req.getParameter("slno");
		String coursecode1 = req.getParameter("coursecode1");
		String coursename1 = req.getParameter("coursename1");
		String gradepoints1 = req.getParameter("gradepoints1");
		String coursecode2 = req.getParameter("coursecode2");
		String coursename2 = req.getParameter("coursename2");
		String gradepoints2 = req.getParameter("gradepoints2");
		String coursecode3 = req.getParameter("coursecode3");
		String coursename3 = req.getParameter("coursename3");
		String gradepoints3 = req.getParameter("gradepoints3");

		int nslno = Integer.parseInt(slno);
		int ngradepoints1 = Integer.parseInt(gradepoints1);
		int ngradepoints2 = Integer.parseInt(gradepoints2);
		int ngradepoints3 = Integer.parseInt(gradepoints3);

		Studentmarkscarddto dto1 = new Studentmarkscarddto();
		dto1.setUsn(usn);
		dto1.setName(name);
		dto1.setFathername(fathername);
		dto1.setCollege(college);
		dto1.setSlno(nslno);
		dto1.setCoursecode1(coursecode1);
		dto1.setCoursename1(coursename1);
		dto1.setGradepoints1(ngradepoints1);
		dto1.setCoursecode2(coursecode2);
		dto1.setCoursename2(coursename2);
		dto1.setGradepoints2(ngradepoints2);
		dto1.setCoursecode3(coursecode3);
		dto1.setCoursename3(coursename3);
		dto1.setGradepoints3(ngradepoints3);
		
		Vtuadmindao dao=new Vtuadmindao();
		dao.insertMarkscardDetails(dto1);
		
		  RequestDispatcher rd= req.getRequestDispatcher("Adminhome.jsp");
		    rd.forward(req, resp);

	}
}
