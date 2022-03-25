<%@page import="br.com.uniamerica.transportadora.caminhao.CaminhaoDAO"%>
<%@page import="br.com.uniamerica.transportadora.caminhao.Caminhao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Editar Caminhao</title>
	</head>
	<body>
	
		<div style="height: 100%; justify-content: center; display: flex;">
		
			<form action="salvarMateria" method="post" 
					style="width: 300px; 
						border: 1px solid #009a84;
						padding: 15px;
						border-radius: 10px 10px 10px 10px;">
						
				<h1 style="text-align: center; color: #009a84;">Editar Caminhao</h1>
				
				<hr> <br />
				
				<%
								Caminhao caminhao = CaminhaoDAO.caminhao; int index = CaminhaoDAO.index;
								%>
				
				<label style="color: #009a84">ID: </label><br />
				<input type="text" name="index" value="<%= index %>" style="width: 100%">
			
				<br /> <br />
			
				<label style="color: #009a84">placa: </label><br />
				<input type="text" name="placa" value="<%= caminhao.getPlaca() %>" style="width: 100%">
				
				<br /><br />
				
				<label style="color: #009a84">marca: </label><br />
				<input type="text" name="marca" value="<%= caminhao.getMarca() %>" style="width: 100%">
				
				<br /><br />				

				<label style="color: #009a84">modelo: </label><br />
				<input type="text" name="modelo" value="<%= caminhao.getModelo() %>" style="width: 100%">
				
				<br /><br />
				
				<label style="color: #009a84">ano: </label><br />
				<input type="text" name="ano" value="<%= caminhao.getAno() %>" style="width: 100%">
				
				<br /><br />	
				
				<label style="color: #009a84">tara: </label><br />
				<input type="text" name="tara" value="<%= caminhao.getTara() %>" style="width: 100%">
				
				<br /><br />
				
				<label style="color: #009a84">eixos: </label><br />
				<input type="text" name="eixos" value="<%= caminhao.getEixos() %>" style="width: 100%">
				
				<br /><br />
				
				<label style="color: #009a84">cor: </label><br />
				<input type="text" name="cor" value="<%= caminhao.getCor() %>" style="width: 100%">
				
				<br /><br />
				
				<label style="color: #009a84">obs: </label><br />
				<input type="text" name="obs" value="<%= caminhao.getObs() %>" style="width: 100%">
				
				<br /><br />													
							
				<br /><br /><br />
							
				
				<div style="width: 100%;">
					<div style="width: 50%; float: left;">
						
						<a href="listarCaminhao.jsp" style="
								background: #009a84;
							    font-size: 16px;
							    color: white;
							    width: 100%;
							    text-align: center;
							    padding: 10px 10px 10px 10px;
							    text-decoration: auto;
							    border-radius: 10px 10px 10px 10px;"> 
							Listar Caminhao 
						</a>
						
					</div>
					<div style="width: 50%; float: right;">
						<input type="submit" value="Editar"
							style="
							    background: #009a84;
							    font-size: 16px;
							    color: white;
							    width: 100%;
							    text-align: center;
							    padding: 8px 10px 8px 10px;
							    text-decoration: auto;
							    border-radius: 10px 10px 10px 10px;
							    margin-top: -10px;">
					</div>	
				</div>
				
			</form>
		</div>
	
	</body>
</html>