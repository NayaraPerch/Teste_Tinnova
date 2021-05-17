package veiculos.controller;

import java.util.Date;
import java.util.List;

import veiculos.entities.Veiculo;
import veiculos.DAO.RetrieveDAO;

public class Retrieve {
	
	private static RetrieveDAO retrieveDao; 
	
	
	public List<Veiculo> veiculosNaoVendidos() {
		return retrieveDao.veiculosNaoVendidos();
	}
	
	public List<Veiculo> distribuicaoDeVeiculosDataFabricacao(Date dataFabricacao) {
		return retrieveDao.distribuicaoVeiculosDataFabricacao(dataFabricacao);
	}
	
	public List<Veiculo> distribuicaoDeVeiculosPorFabricante(String fabricante) {
		return retrieveDao.distribuicaoVeiculosPorFabricante(fabricante);
	}
	
	public List<Veiculo> carrosRegistrados(Date dtInicio, Date dtFim) {
		return retrieveDao.carrosRegistrados(dtInicio, dtFim);
	}
	
	
}
