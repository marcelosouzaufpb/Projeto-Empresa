package br.ADM_Eagle.Test;

import br.ADM_Eagle.DAO.ClientsManagerDAO;
import br.ADM_Eagle.Models.Address;
import br.ADM_Eagle.Models.Clients;
import br.ADM_Eagle.Models.Telephone;

public class Main_Test_BANK {

	public static void main(String[] args) {
		
		Telephone tel = new Telephone(99,9999,"99");
		Address end = new Address();
		Clients c = new Clients();
		c.setId(1);
		c.setNome("marceloSouzaSantos");
		c.setEmail("marcelo@dce.ufpb.br");
		c.setTelefone(tel);
		c.setEndereco(end);
		c.setObservacao("obs");
		
		ClientsManagerDAO dao = new ClientsManagerDAO();
		//dao.add(c); // funcao para add um contato
		//dao.delete(c); // funcao para remover
		//dao.update(c); //funcao para atualizar dados
		dao.list(); //funcao para listar todos os elemento do banco  
		// tem mais funcao na classe GerenteDeClienteDao voces podem olhar la ta bem intuitivo
		

	}

}
