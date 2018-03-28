package br.ADM_Eagle.Models;

public class People {
	private String name;
	private String cpf;
	private String rg;
	private String email;
	private Telephone telphone;
	private Address address;

	public People() {
		this.name = null;
		this.cpf = null;
		this.rg = null;
		this.email = null;
		this.telphone = null;
		this.address = null;
	}

	public People(String nome, String cpf, String rg, String email, Telephone telefone, Address endereco) {
		super();
		this.name = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.email = email;
		this.telphone = telefone;
		this.address = endereco;
	}

	public String toString() {
		return "Nome: " + this.name + ",CPF: " + this.cpf + ",RG: " + this.rg + ",Email: " + this.email + ",Telefone: "
				+ this.telphone + ",Endereco: " + this.address;
	}

	public String getNome() {
		return name;
	}

	public void setNome(String nome) {
		this.name = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Telephone getTelefone() {
		return telphone;
	}

	public void setTelefone(Telephone telefone) {
		this.telphone = telefone;
	}

	public Address getEndereco() {
		return address;
	}

	public void setEndereco(Address endereco) {
		this.address = endereco;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((rg == null) ? 0 : rg.hashCode());
		result = prime * result + ((telphone == null) ? 0 : telphone.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		People other = (People) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		if (telphone == null) {
			if (other.telphone != null)
				return false;
		} else if (!telphone.equals(other.telphone))
			return false;
		return true;
	}

}
