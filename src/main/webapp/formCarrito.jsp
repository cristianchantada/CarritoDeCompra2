<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="index.jsp" method="POST">
		<input type="checkbox" name="productos" value="X-Box" >
		<label>X-Box</label>
		<br>
		<input type="checkbox" name="productos" value="Play Station" >
		<label>Play Station</label>
		<br>
		<input type="checkbox" name="productos" value="Nintendo" >
		<label>Nintendo</label>
		<br>
		<input type="checkbox" name="productos" value="Gafas VR" >
		<label>Gafas VR</label>
		<br>
		<input type="checkbox" name="productos" value="Drone Dji" >
		<label>Drone Dji</label>
		<br>
		<input type="submit" value="Comprar productos" >
	</form>
	<h2>Este es mi carrito de la compra</h2>
	<%
	
		/*List<String> misCompras;
	
		if(misCompras ==null){
			misCompras = new ArrayList<>();
		}
	
		String[] elementosCarro = request.getParameterValues("productos");
		
	if(elementosCarro != null){*/
	%>
		<ul>
	    <% /*for(String elementoCarro : elementosCarro){ */%>
	        <li><%= /*elementosCarro*/%></li>
	<%		
		/*}*/
 	%>
	</ul>

</body>
</html>