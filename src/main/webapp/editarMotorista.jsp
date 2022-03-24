<%@page import="br.com.uniamerica.transportadora.motorista.Motorista"%>
<%@page import="br.com.uniamerica.transportadora.motorista.MotoristaDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Editar Motorista</title>
	</head>
	<body>
	
		<div style="height: 100%; justify-content: center; display: flex;">
		
			<form action="salvarMotorista" method="post" 
					style="width: 300px; 
						border: 1px solid #009a84;
						padding: 15px;
						border-radius: 10px 10px 10px 10px;">
						
				<h1 style="text-align: center; color: #009a84;">Editar Motorista</h1>
				
				<hr> <br />
				
				<%
								Motorista motorista = MotoristaDAO.motorista; int index = MotoristaDAO.index;
								%>
				
				<label style="color: #009a84">ID: </label><br />
				<input type="text" name="index" value="<%= index %>" style="width: 100%">
			
				<br /> <br />
			
				<label style="color: #009a84">Nome: </label><br />
				<input type="text" name="nome" value="<%= motorista.getNome() %>" style="width: 100%">
				
				<br /><br />
				
				<label style="color: #009a84">cpf: </label> <br />
				<input type="text" name="cpf" value="<%= motorista.getCpf() %>" style="width: 100%">
				
				<br /><br />
				
				<label style="color: #009a84">telefone: </label> <br />
				<input type="text" name="telefone" value="<%= motorista.getTelefone() %>" style="width: 100%">				
							
				<br /><br />
				
				<label style="color: #009a84">Data de Nascimento: </label> <br />
				<input type="text" name="dataNascimento" value="<%= motorista.getDataNascimento() %>" style="width: 100%">							

				<br /><br />
				
				<label style="color: #009a84">Endereço: </label> <br />
				<input type="text" name="endereco" value="<%= motorista.getEndereco() %>" style="width: 100%">				
				
				<br /><br />
				
				<label style="color: #009a84">Obs: </label> <br />
				<input type="text" name="obs" value="<%= motorista.getObs() %>" style="width: 100%">
				
				<br /><br /><br />
							
				
				<div style="width: 100%;">
					<div style="width: 50%; float: left;">
						
						<a href="listarAluno.jsp" style="
								background: #009a84;
							    font-size: 16px;
							    color: white;
							    width: 100%;
							    text-align: center;
							    padding: 10px 10px 10px 10px;
							    text-decoration: auto;
							    border-radius: 10px 10px 10px 10px;"> 
							Listar Motoristas
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