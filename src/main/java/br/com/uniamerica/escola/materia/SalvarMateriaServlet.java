package br.com.uniamerica.escola.materia;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(
	name = "salvarMateria",
	urlPatterns = "/salvarMateria"
)
public class SalvarMateriaServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;
	
	
	public void doPost(
			HttpServletRequest httpServletRequest, 
			HttpServletResponse httpServletResponse
	) throws IOException {
		
		Materia materia = new Materia();
		MateriaDAO materiaDAO = new MateriaDAO();
		
		
		int index = -1;
		
		if (httpServletRequest.getParameter("index") != null) {
			index = Integer.valueOf(httpServletRequest.getParameter("index"));
		}
		
		
		materia.setNome(httpServletRequest.getParameter("nome"));
		materia.setProfessor(httpServletRequest.getParameter("professor"));
		materia.setCargaHoraria(Integer.valueOf(httpServletRequest.getParameter("cargaHoraria")));
		
		
		if (index >= 0 ) {
			materiaDAO.atualizar(index, materia);	
		}
		else {
			materiaDAO.cadastrar(materia);
		}
		
		
		httpServletResponse.sendRedirect("listarMateria.jsp");
	}
}
