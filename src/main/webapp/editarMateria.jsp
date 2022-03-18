<%@page import="br.com.uniamerica.escola.materia.MateriaDAO"%>
<%@page import="br.com.uniamerica.escola.materia.Materia"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Editar Matéria</title>
	</head>
	<body>
	
		<div style="height: 100%; justify-content: center; display: flex;">
		
			<form action="salvarMateria" method="post" 
					style="width: 300px; 
						border: 1px solid #009a84;
						padding: 15px;
						border-radius: 10px 10px 10px 10px;">
						
				<h1 style="text-align: center; color: #009a84;">Editar Matéria</h1>
				
				<hr> <br />
				
				<% Materia materia = MateriaDAO.materia; int index = MateriaDAO.index; %>
				
				<label style="color: #009a84">ID: </label><br />
				<input type="text" name="index" value="<%= index %>" style="width: 100%">
			
				<br /> <br />
			
				<label style="color: #009a84">Nome: </label><br />
				<input type="text" name="nome" value="<%= materia.getNome() %>" style="width: 100%">
				
				<br /><br />
				
				<label style="color: #009a84">Professor: </label> <br />
				<input type="text" name="professor" value="<%= materia.getProfessor() %>" style="width: 100%">
				
				<br /><br />
				
				<label style="color: #009a84">Carga Horaria: </label> <br />
				<input type="text" name="cargaHoraria" value="<%= materia.getCargaHoraria() %>" style="width: 100%">
							
				<br /><br /><br />
							
				
				<div style="width: 100%;">
					<div style="width: 50%; float: left;">
						
						<a href="listarMateria.jsp" style="
								background: #009a84;
							    font-size: 16px;
							    color: white;
							    width: 100%;
							    text-align: center;
							    padding: 10px 10px 10px 10px;
							    text-decoration: auto;
							    border-radius: 10px 10px 10px 10px;"> 
							Listar Materias 
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