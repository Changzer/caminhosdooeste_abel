package br.com.uniamerica.transportadora.caminhao;

import java.util.ArrayList;

public class CaminhaoDAO {
	
	
	public static ArrayList<Caminhao> caminhaos = new ArrayList<Caminhao>();
	public static Caminhao motorista = new Caminhao();
	public static int index = -1;
	
	
	public CaminhaoDAO() {}
	
	
	
	public void cadastrar(Caminhao caminhao) {
		caminhaos.add(caminhao);
	}
	
	public void atualizar(int index, Caminhao caminhao) {
		caminhaos.set(index, caminhao);
	}
	
	public void excluir(int index) {
		caminhaos.remove(index);
	}
	
	public Caminhao findByIndex(int index) {
		return caminhaos.get(index);
	}
}
