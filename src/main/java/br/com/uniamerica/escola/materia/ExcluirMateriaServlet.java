package br.com.uniamerica.escola.materia;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(
		name = "excluirMateria",
		urlPatterns = "/excluirMateria"
	)
public class ExcluirMateriaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	
	public void doPost(
			HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse
	) throws IOException {
		
		int index = Integer.valueOf(httpServletRequest.getParameter("index"));
		
		
		MateriaDAO materiaDAO = new MateriaDAO();
		materiaDAO.excluir(index);
		
		
		httpServletResponse.sendRedirect("listarMateria.jsp");
	}
}
