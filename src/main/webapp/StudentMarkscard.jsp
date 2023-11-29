<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="./StudentMarkscard.css">
</head>
<body>
	<div id="studentlogbody">
		<div id="form">
			<form action="fetchstudentmarkscardbyusn">
				<div id="form11">
					<div id="heading">
						<h3>Fetch Markscard</h3>
					</div>
					<table>
						<tr>
							<td><label>USN :</label></td>
							<td><input type="text" id="inp1" name="usn" /></td>
						</tr>
						<tr>
							<td><label>Name :</label></td>
							<td><input type="text" id="inp2" name="name" /></td>
						</tr>

					</table>
					<button id="btn">Fetch</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>