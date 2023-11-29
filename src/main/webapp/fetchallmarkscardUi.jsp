<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="java.util.List"%>
<%@page import="Dto.Studentmarkscarddto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" type="text/css" href="./fetchallmarkscardUi.css">
<body>
	<%
	List<Studentmarkscarddto> l = (List<Studentmarkscarddto>)request.getAttribute("markscards");
	%>
	<%for(Studentmarkscarddto o:l){ %>
	<%System.out.print(o);%>
	<%if(o!=null){%>
	<div id="marksbody">
		<div id="vtuinfo">
			<div id="vtulogo">
				<img alt=""
					src="https://upload.wikimedia.org/wikipedia/en/a/a0/Visvesvaraya_Technological_University_logo.png"
					id="img1">
			</div>
			<div id="vtucont">
				<p id="vtuname">
				<h3>ವಿಶ್ವೇಶ್ವರಯ್ಯ ತಾಂತ್ರಿಕ ವಿಶ್ವವಿದ್ಯಾಲಯವು ಬೆಳಗಾವಿ</h3>
				<h3>VISVESVARAYA TECHNOLOGICAL UNIVERSITY</h3>
				<h5 style="padding-left: 130px">KARNATAKA, INDIA</h5>
				<h4 style="padding-left: 100px">B.E. Mechanical Engineering</h4>
				</p>
			</div>
		</div>
		<div id="studentdetails">
			<table cellspacing="10px" cellpadding="10px">
				<tr>
					<td>Student USN</td>
					<td>:<%=o.getUsn().toUpperCase()%></td>
				</tr>
				<tr>
					<td>Name of the Student</td>
					<td>:<%=o.getName().toUpperCase()%></td>
				</tr>
				<tr>
					<td>Father's/Mothers' Name</td>
					<td>:<%=o.getFathername().toUpperCase()%></td>
				</tr>
				<tr>
					<td>Name of the College</td>
					<td>:<%=o.getCollege().toUpperCase()%></td>
				</tr>
				<tr>
					<td>Semester</td>
					<td>:V<sup>th</sup></td>
				</tr>
			</table>
		</div>
		<div id="studentgrade">
			<table cellspacing="10px" cellpadding="10px" border="3px">
				<tr>
				<td>SLNO</td>
				<td>Course Code</td>
				<td>Title of the Course Registered</td>
				<td>Grade Points (G)</td>
				<td><a href="updatemarkscard.jsp?usn=<%=o.getUsn()%>&&name=<%=o.getName()%>&&fathername=<%=o.getFathername()%>&&college=<%=o.getCollege()%>&&coursecode1=<%=o.getCoursecode1()%>&&coursecode2=<%=o.getCoursecode2()%>&&coursecode3=<%=o.getCoursecode3()%>&&coursename1=<%=o.getCoursename1()%>&&coursename2=<%=o.getCoursename2()%>&&coursename3=<%=o.getCoursename3()%>&&gradepoints1=<%=o.getGradepoints1()%>&&gradepoints2=<%=o.getGradepoints2()%>&&gradepoints3=<%=o.getGradepoints3()%>">Edit</a></td>
				</tr>
				<tr>
				<td>1</td>
				<td><%=o.getCoursecode1()%></td>
				<td><%=o.getCoursename1()%></td>
				<td><%=o.getGradepoints1()%></td>
				</tr>
				<tr>
				<td>2</td>
				<td><%=o.getCoursecode2()%></td>
				<td><%=o.getCoursename2()%></td>
				<td><%=o.getGradepoints2()%></td>
				</tr>
				<tr>
				<td>3</td>
				<td><%=o.getCoursecode3()%></td>
				<td><%=o.getCoursename3()%></td>
				<td><%=o.getGradepoints3()%></td>
				</tr>
			</table>
		</div>
	</div>
	<%}else{%>
	<h1 style="color: white">Data Not Found</h1>
	<%}%>
	<%}%>
</body>
</html>