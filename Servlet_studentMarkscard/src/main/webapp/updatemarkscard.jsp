<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" type="text/css" href="./markscard.css">
<body>
<div id="registerbody">
		<div id="form">
		<form action="updatemarkscard">
				<div id="form11">
					<div id="heading">
						<h3>Markscard Sheet</h3>
					</div>
					<table>
						<tr>
							<td><label>USN :</label></td>
							<td><input type="text" id="inp1" name="usn" value="<%=request.getParameter("usn")%>" readonly="readonly"/></td>
						</tr>
						<tr>
							<td><label>Name :</label></td>
							<td><input type="text" id="inp2" name="name" value="<%=request.getParameter("name")%>"/></td>
						</tr>
						<tr>
							<td><label>Father Name :</label></td>
							<td><input type="text" id="inp3" name="fathername" value="<%=request.getParameter("fathername")%>"/></td>
						</tr>
						<tr>
							<td><label>College :</label></td>
							<td><input type="text" id="inp4" name="college" value="<%=request.getParameter("college")%>"/></td>
						</tr>
						<tr>
							<td><label>Course Code 1:</label></td>
							<td><input type="text" id="inp6" name="coursecode1" value="<%=request.getParameter("coursecode1")%>"/></td>
						</tr>
						<tr>
							<td><label>Course Name 1:</label></td>
							<td><input type="text" id="inp7" name="coursename1" value="<%=request.getParameter("coursename1")%>"/></td>
						</tr>
						<tr>
							<td><label>Grade Points 1:</label></td>
							<td><input type="number" id="inp8" name="gradepoints1" value="<%=request.getParameter("gradepoints1")%>"/></td>
						</tr>
						<tr>
							<td><label>Course Code 2:</label></td>
							<td><input type="text" id="inp9" name="coursecode2" value="<%=request.getParameter("coursecode2")%>"/></td>
						</tr>
						<tr>
							<td><label>Course Name 2:</label></td>
							<td><input type="text" id="inp10" name="coursename2" value="<%=request.getParameter("coursename2")%>"/></td>
						</tr>
						<tr>
							<td><label>Grade Points 2:</label></td>
							<td><input type="number" id="inp11" name="gradepoints2" value="<%=request.getParameter("gradepoints2")%>"/></td>
						</tr>
						<tr>
							<td><label>Course Code 3:</label></td>
							<td><input type="text" id="inp12" name="coursecode3" value="<%=request.getParameter("coursecode3")%>"/></td>
						</tr>
						<tr>
							<td><label>Course Name 3:</label></td>
							<td><input type="text" id="inp13" name="coursename3" value="<%=request.getParameter("coursename3")%>"/></td>
						</tr>
						<tr>
							<td><label>Grade Points 3:</label></td>
							<td><input type="number" id="inp14" name="gradepoints3" value="<%=request.getParameter("gradepoints3")%>"/></td>
						</tr>
					</table>
					<button id="btn">submit</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>