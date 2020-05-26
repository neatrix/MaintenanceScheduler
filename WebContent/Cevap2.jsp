<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
p1 {
	position: fixed;
	top: 200px;
	left: 750px;
	background-position: center;
}

h1 {
	position: fixed;
	top: 100px;
	left: 500px;
}

img {
	padding: 5px;
	width: 150px;
	position: fixed;
	top: 400px;
	left: 500px;
}
</style>
</head>
<body>



	<form action="index.html">
		<h1> Musteri   <%
	String full = request.getAttribute("name").toString();
		
	out.println(full);
%>'nin Ariza Kayidi Gerceklesti 
</h1>
		<p1>
		<table align=center;>
			<tr>
				<h1 align=center style="color: black;"></h1>
			
			 <button type="submit" value="Anasayfa"
					style="background-color: #4CAF50; border-radius: 5%; padding: 4px 7px; color: white; border: none;">Anasayfa</button>
			

		</table>



		</p1>

		<img src="https://turkiye.ai/trai-assets/uploads/2018/01/Etiya-logo.fw_.png" alt="W3Schools.com" >
	</form>


</body>
</html>