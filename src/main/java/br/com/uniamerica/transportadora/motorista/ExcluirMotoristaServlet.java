package br.com.uniamerica.transportadora.motorista;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(
		name = "excluirMotorista",
		urlPatterns = "/excluirMotorista"
	)
public class ExcluirMotoristaServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;
	
	
	public void doPost(
			HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse
	) throws IOException {
		
		int index = Integer.valueOf(httpServletRequest.getParameter("index"));
		
		MotoristaDAO motoristaDAO = new MotoristaDAO();
		motoristaDAO.excluir(index);
		
		httpServletResponse.sendRedirect("listarMotorista.jsp");
	}
}
