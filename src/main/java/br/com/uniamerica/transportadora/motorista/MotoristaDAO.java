package br.com.uniamerica.transportadora.motorista;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Factory.ConnectionFactory;

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
	
	
	public void initDatabase() {
		createMotoristaTable();
	}
	
	private String tableName = "motorista";
	private Connection connection = new ConnectionFactory().getConnection();
	
	public void createMotoristaTable() {
		String sql = "CREATE SEQUENCE IF NOT EXISTS motorista_id_seq;";
		
		sql += "CREATE TABLE IF NOT EXISTS " + tableName + " ( " +
		"motorista_id BIGINT PRIMARY KEY DEFAULT nextval('motorista_id_seq')," +
		"nome VARCHAR(50) NOT NULL, "+
		"cpf VARCHAR(12) NOT NULL, "+
		"telefone VARCHAR(15) NOT NULL, " +
		"dataNascimento VARCHAR(10), " +
		"endereco TEXT, " +
		"obs TEXT )";
		
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.execute();
			statement.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	public Motorista cadastraMotorista(Motorista motorista) {
		if(motorista != null) {
			String sql = "INSERT INTO " + tableName + " (" +
					"nome, cpf, telefone, dataNascimento, endereco, obs)" +
					"VALUES (?, ?, ?, ?, ?, ?)";
			
			try {
				PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				
				statement.setString(1,  motorista.getNome());
				statement.setString(2,  motorista.getCpf());
				statement.setString(3, motorista.getTelefone());
				statement.setString(4,  motorista.getDataNascimento());
				statement.setString(5, motorista.getEndereco());
				statement.setString(6, motorista.getObs());
				
				statement.execute();
				ResultSet resultSet = statement.getGeneratedKeys();
				
				while(resultSet.next()) {
					motorista.setId(resultSet.getLong(1));
				}
				return motorista;
			}
			catch (SQLException e) {
				return null;
			}
		}
		return null;
	}
	
	
}
