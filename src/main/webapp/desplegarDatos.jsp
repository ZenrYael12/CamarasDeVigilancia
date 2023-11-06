<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ page import="modelo.camaraDatos, java.util.ArrayList"%>
<%
ArrayList<camaraDatos> ingresar = (ArrayList<camaraDatos>) request.getAttribute("ingresar");
camaraDatos datos = null;
int n = ingresar.size();
%>
<table>
		<tr>
			<th>Fecha</th>
			<th>Matricula</th>
			<th>Foto</th>
		</tr>
		<%
		for (int i = 0; i < n; i++) {
		%>
		<tr>
			<td><%=ingresar.get(i).getFecha()%></td>
			<td><%=ingresar.get(i).getMatricula()%></td>
			<td><%=ingresar.get(i).getFoto()%></td>			
		</tr>  
		<%
  		}
  		%>   


</table>
</body>
</html>