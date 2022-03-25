package br.com.uniamerica.transportadora.caminhao;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(
	name = "editarCaminhao",
	urlPatterns = "/editarCaminhao"
)
public class EditarCaminhaoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	
	CaminhaoDAO caminhaoDAO = new CaminhaoDAO();
	
	
	public void doPost(
			HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse
	) throws IOException {
		
		CaminhaoDAO.index = Integer.valueOf(httpServletRequest.getParameter("index"));
		CaminhaoDAO.caminhao = caminhaoDAO.findByIndex(CaminhaoDAO.index);
		
		
		httpServletResponse.sendRedirect("editarCaminhao.jsp");
	}
	
}
