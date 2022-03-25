package br.com.uniamerica.transportadora.caminhao;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(
		name = "excluirCaminhao",
		urlPatterns = "/excluirCaminhao"
	)
public class ExcluirCaminhaoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	
	public void doPost(
			HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse
	) throws IOException {
		
		int index = Integer.valueOf(httpServletRequest.getParameter("index"));
		
		
		CaminhaoDAO caminhaoDAO = new CaminhaoDAO();
		caminhaoDAO.excluir(index);
		
		
		httpServletResponse.sendRedirect("listarCaminhao.jsp");
	}
}
