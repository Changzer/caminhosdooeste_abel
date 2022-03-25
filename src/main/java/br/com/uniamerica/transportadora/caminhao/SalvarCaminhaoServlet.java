package br.com.uniamerica.transportadora.caminhao;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(
	name = "salvarCaminhao",
	urlPatterns = "/salvarCaminhao"
)
public class SalvarCaminhaoServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;
	
	
	public void doPost(
			HttpServletRequest httpServletRequest, 
			HttpServletResponse httpServletResponse
	) throws IOException {
		
		Caminhao caminhao = new Caminhao();
		CaminhaoDAO caminhaoDAO = new CaminhaoDAO();
		
		
		int index = -1;
		
		if (httpServletRequest.getParameter("index") != null) {
			index = Integer.valueOf(httpServletRequest.getParameter("index"));
		}
		
		

		
		caminhao.setPlaca(httpServletRequest.getParameter("placa"));
		caminhao.setMarca(httpServletRequest.getParameter("marca"));
		caminhao.setModelo(httpServletRequest.getParameter("modelo"));
		caminhao.setAno(Long.valueOf(httpServletRequest.getParameter("ano")));
		caminhao.setTara(Long.valueOf(httpServletRequest.getParameter("tara")));
		caminhao.setEixos(Integer.valueOf(httpServletRequest.getParameter("eixos")));
		caminhao.setCor(httpServletRequest.getParameter("cor"));
		caminhao.setObs(httpServletRequest.getParameter("obs"));
		
		
		if (index >= 0 ) {
			caminhaoDAO.atualizar(index, caminhao);	
		}
		else {
			caminhaoDAO.cadastrar(caminhao);
		}
		
		
		httpServletResponse.sendRedirect("listarCaminhao.jsp");
	}
}
