package br.ADM_Eagle.Models;

public class Address {
	private int cep;
	private int number;
	private String street;
	private String neighborhood;
	private String city;
	private String state;
	private String complement;

	public Address() {
		this.cep = 0;
		this.number = 0;
		this.street = null;
		this.neighborhood = null;
		this.city = null;
		this.state = null;
		this.complement = null;
	}

	public Address(int cep, int numero, String rua, String bairro, String cidade, String estado, String complemento) {
		super();
		this.cep = cep;
		this.number = numero;
		this.street = rua;
		this.neighborhood = bairro;
		this.city = cidade;
		this.state = estado;
		this.complement = complemento;
	}

	public String toString() {
		return this.cep + "-" + this.number + "-" + this.street + "-" + this.neighborhood + "-" + this.city + "-"
				+ this.state;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public int getNumero() {
		return number;
	}

	public void setNumero(int numero) {
		this.number = numero;
	}

	public String getRua() {
		return street;
	}

	public void setRua(String rua) {
		this.street = rua;
	}

	public String getBairro() {
		return neighborhood;
	}

	public void setBairro(String bairro) {
		this.neighborhood = bairro;
	}

	public String getCidade() {
		return city;
	}

	public void setCidade(String cidade) {
		this.city = cidade;
	}

	public String getEstado() {
		return state;
	}

	public void setEstado(String estado) {
		this.state = estado;
	}

	public String getComplemento() {
		return complement;
	}

	public void setComplemento(String complemento) {
		this.complement = complemento;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((neighborhood == null) ? 0 : neighborhood.hashCode());
		result = prime * result + cep;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + number;
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (neighborhood == null) {
			if (other.neighborhood != null)
				return false;
		} else if (!neighborhood.equals(other.neighborhood))
			return false;
		if (cep != other.cep)
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (number != other.number)
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		return true;
	}

}
