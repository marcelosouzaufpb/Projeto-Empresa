package br.ADM_Eagle.Models;

public class Telephone {
	private int number;
	private int dd;
	private String operator;

	public Telephone() {
		this.number = 0;
		this.dd = 0;
		this.operator = null;
	}

	public Telephone(int numero, int dd, String operadora) {
		super();
		this.number = numero;
		this.dd = dd;
		this.operator = operadora;
	}

	public String toString() {
		return "(" + this.dd + ")" + this.number + ":" + this.operator;
	}

	public int getNumero() {
		return number;
	}

	public void setNumero(int numero) {
		this.number = numero;
	}

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public String getOperadora() {
		return operator;
	}

	public void setOperadora(String operadora) {
		this.operator = operadora;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dd;
		result = prime * result + number;
		result = prime * result + ((operator == null) ? 0 : operator.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telephone other = (Telephone) obj;
		if (dd != other.dd)
			return false;
		if (number != other.number)
			return false;
		if (operator == null) {
			if (other.operator != null)
				return false;
		} else if (!operator.equals(other.operator))
			return false;
		return true;
	}

}
