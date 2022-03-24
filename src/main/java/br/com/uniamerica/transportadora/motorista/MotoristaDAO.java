package br.com.uniamerica.transportadora.motorista;

import java.util.ArrayList;

public class MotoristaDAO {
	
	
	public static ArrayList<Motorista> motoristas = new ArrayList<Motorista>();
	public static Motorista motorista = new Motorista();
	public static int index = -1;
	
	
	public MotoristaDAO() {}
	
	
	
	public void cadastrar(Motorista motorista) {
		motoristas.add(motorista);
	}
	
	public void atualizar(int index, Motorista motorista) {
		motoristas.set(index, motorista);
	}
	
	public void excluir(int index) {
		motoristas.remove(index);
	}
	
	public Motorista findByIndex(int index) {
		return motoristas.get(index);
	}
}
