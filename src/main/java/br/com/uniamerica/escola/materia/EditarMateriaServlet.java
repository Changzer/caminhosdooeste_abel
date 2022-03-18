package br.com.uniamerica.escola.materia;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(
	name = "editarMateria",
	urlPatterns = "/editarMateria"
)
public class EditarMateriaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	
	MateriaDAO materiaDAO = new MateriaDAO();
	
	
	public void doPost(
			HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse
	) throws IOException {
		
		MateriaDAO.index = Integer.valueOf(httpServletRequest.getParameter("index"));
		MateriaDAO.materia = materiaDAO.findByIndex(MateriaDAO.index);
		
		
		httpServletResponse.sendRedirect("editarMateria.jsp");
	}
	
}
