package br.Empresa.Controller;

import java.util.ArrayList;

import br.Empresa.DAO.ClientsManagerDAO;
import br.Empresa.Models.Clients;

public class ClientsManager {
	private ArrayList<Clients> clientsList;
	private ClientsManagerDAO clientsDao;

	public ClientsManager(ArrayList<Clients> clientsList, ClientsManagerDAO clientsDao) {
		super();
		this.clientsList = clientsList;
		this.clientsDao = clientsDao;
	}

	public String toString() {
		return "ClientsManager [clientsList=" + clientsList + ", clientsDao=" + clientsDao + "]";
	}

	public ArrayList<Clients> getClientsList() {
		return clientsList;
	}

	public void setClientsList(ArrayList<Clients> clientsList) {
		this.clientsList = clientsList;
	}

	public ClientsManagerDAO getClientsDao() {
		return clientsDao;
	}

	public void setClientsDao(ClientsManagerDAO clientsDao) {
		this.clientsDao = clientsDao;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clientsDao == null) ? 0 : clientsDao.hashCode());
		result = prime * result + ((clientsList == null) ? 0 : clientsList.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClientsManager other = (ClientsManager) obj;
		if (clientsDao == null) {
			if (other.clientsDao != null)
				return false;
		} else if (!clientsDao.equals(other.clientsDao))
			return false;
		if (clientsList == null) {
			if (other.clientsList != null)
				return false;
		} else if (!clientsList.equals(other.clientsList))
			return false;
		return true;
	}

}
