package br.com.uniamerica.escola.materia;

import java.util.ArrayList;

public class MateriaDAO {
	
	
	public static ArrayList<Materia> materias = new ArrayList<Materia>();
	public static Materia materia = new Materia();
	public static int index = -1;
	
	
	
	public MateriaDAO() {}
	
	
	
	public void cadastrar(Materia materia) {
		materias.add(materia);
	}
	
	public void atualizar(int index, Materia materia) {
		materias.set(index, materia);
	}
	
	public void excluir(int index) {
		materias.remove(index);
	}
	
	public Materia findByIndex(int index) {
		return materias.get(index);
	}
}
