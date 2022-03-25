package br.com.uniamerica.transportadora.motorista;

import java.io.IOException;
import java.time.LocalDate;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(
	name = "salvarMotorista",
	urlPatterns = "/salvarMotorista"
)
public class SalvarMotoristaServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;
	
	
	public void doPost(
			HttpServletRequest httpServletRequest, 
			HttpServletResponse httpServletResponse
	) throws IOException {
		
		Motorista motorista = new Motorista();
		MotoristaDAO motoristaDAO = new MotoristaDAO();
		
		
		int index = -1;
		
		if (httpServletRequest.getParameter("index") != null) {
			index = Integer.valueOf(httpServletRequest.getParameter("index"));
		}
		
		motorista.setNome(httpServletRequest.getParameter("nome"));
		motorista.setCpf(httpServletRequest.getParameter("cpf"));
		motorista.setTelefone(httpServletRequest.getParameter("telefone"));
		motorista.setDataNascimento(httpServletRequest.getParameter("dataNascimento"));
		motorista.setEndereco(httpServletRequest.getParameter("endereco"));
		motorista.setObs(httpServletRequest.getParameter("obs"));
		
		if (index >= 0 ) {
			motoristaDAO.atualizar(index, motorista);	
		}
		else {
			motoristaDAO.cadastrar(motorista);
		}
		
		
		httpServletResponse.sendRedirect("listarMotorista.jsp");
	}
}
