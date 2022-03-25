<%@page import="br.com.uniamerica.transportadora.motorista.MotoristaDAO"%>
<%@page import="br.com.uniamerica.transportadora.motorista.Motorista"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Lista de Motorista</title>
	</head>
	<body>
		
		<div style="height: 100%; justify-content: center; display: flex;">
			<div style="width: 800px;">
				<h1 style="text-align: center; color: #009a84;"> Lista de Motoristas </h1>
		
				<a href="cadastrarMotorista.jsp" 
					 style="float: right; 
						 background: #009a84; 
						 font-size: 24px; 
						 color: white; 
						 text-align: center; 
						 padding: 5px 11px 5px 10px; 
						 text-decoration: auto; 
						 border-radius: 100px 100px 100px 100px; 
						 margin-top: -60px;"> 
					 Cadastrar Motoristas
				 </a>
		
				<hr>
				
				<table border="1" style="width: 100%">
					<tr style="background: #009a84; color: white;">
						<th>ID</th>
						<th>Nome</th>
						<th>Cpf</th>
						<th>telefone</th>
						<th>data de nascimento</th>
						<th>endereço</th>
						<th>obs</th>
					</tr>
		
					<%
							ArrayList<Motorista> motoristas = MotoristaDAO.motoristas;
							%>
					
					<% for (int i = 0; i < motoristas.size(); i++) { %>
						
						<tr style="color: #009a84">
							<th> <%= i %> </th>
							<th> <%= motoristas.get(i).getNome() %> </th>
							<th> <%= motoristas.get(i).getCpf() %> </th>
							<th> <%= motoristas.get(i).getTelefone() %> </th>
							<th> <%= motoristas.get(i).getDataNascimento() %> </th>
							<th> <%= motoristas.get(i).getEndereco() %> </th>
							<th> <%= motoristas.get(i).getObs() %> </th>

							<th style="width: 150px">
						        
								<form action="editarMotorista" method="post" style="width: 50%; float: left;">
									<input type="hidden" name="index" value="<%= i %>">
									<input type="submit" value="Editar" style="background: #9a8400; color: white">
								</form>
						        
								<form action="excluirMotorista" method="post" style="width: 50%; float: right;">
									<input type="hidden" name="index" value="<%= i %>">
									<input type="submit" value="Excluir" style="background: #9a0016; color: white">
								</form>
						    
							</th>
						</tr>
					
					<% } %>
		
				</table>
				
				<a href="menu.jsp" style="
						background: #009a84;
					    font-size: 16px;
					    color: white;
					   	text-align: center;
					    padding: 10px 10px 10px 10px;
					    text-decoration: auto;
					    border-radius: 10px 10px 10px 10px;
					    margin-top: 20px;
					    position: absolute;"> 
					Voltar para o Menu
				</a>
			</div>
		</div>
			
	</body>
</html>