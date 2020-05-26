<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
p1 {
	position: fixed;
	top: 200px;
	left: 300px;
	background-position: center;
}

h1 {
	position: fixed;
	top: 100px;
	right: 635px;
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



	<form action="AddRecords" method="GET">  
			<h1> Hosgeldin  <%
	String full = request.getAttribute("name").toString();
		
	out.println(full);
%></h1>
		<p1>
		<table align=center;>
			<tr>
				<h1 align=center style="color: black;"></h1>
			
				
				<td align=center><input type="text" name="clientname"
					placeholder="Musteri ismi"></td>
					<td align=center><input type="text" name="clientmail"
					placeholder="Email adresi"></td>
				
				<td align=center> <select name="options" >
    <option value="Bakim">Bakim</option>
    <option value="Parca">Parca Degisimi</option>
   
  </select></td>
 <td align=center><input type="text" name="products"
					placeholder="Bakim yapilacak urun"></td>
  <td align=center> Bir Sonraki Bakim Zamani (Gun)   <select name="day" >
  
    <option value="1">1</option>
	<option value="2">2</option>
	<option value="3">3</option>
	<option value="4">4</option>
	<option value="5">5</option>
	<option value="6">6</option>
	<option value="7">7</option>
	<option value="8">8</option>
	<option value="9">9</option>
	<option value="10">10</option>
	 <option value="11">11</option>
	<option value="12">12</option>
	<option value="13">13</option>
	<option value="14">14</option>
	<option value="15">15</option>
	<option value="16">16</option>
	<option value="17">17</option>
	<option value="18">18</option>
	<option value="19">19</option>
	<option value="20">20</option>
	<option value="100000">Bakim Yok/Parca Degisti</option>
    
   
  </select></td>
  
				
			

			


			
				
				<td align=center><input type="submit" value="Yeni Ariza Kayit"
					style="background-color: #FF8C00; border-radius: 5%; padding: 8px 15px; color: white; border: none;" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td></td>
				<td align=center></td>
			</tr>
			

		</table>



		</p1>

		<img src="https://turkiye.ai/trai-assets/uploads/2018/01/Etiya-logo.fw_.png" alt="W3Schools.com" >
	</form>


</body>
</html>