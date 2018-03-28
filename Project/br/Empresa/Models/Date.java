package br.Empresa.Models;

public class Date {
	private int day;
	private int month;
	private int year;

	public Date() {
		this.day = 0;
		this.month = 0;
		this.year = 0;
	}

	public Date(int dia, int mes, int ano) {
		this.day = dia;
		this.month = mes;
		this.year = ano;
	}

	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

	public int getDia() {
		return day;
	}

	public void setDia(int dia) {
		this.day = dia;
	}

	public int getMes() {
		return month;
	}

	public void setMes(int mes) {
		this.month = mes;
	}

	public int getAno() {
		return year;
	}

	public void setAno(int ano) {
		this.year = ano;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + year;
		result = prime * result + day;
		result = prime * result + month;
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		if (year != other.year)
			return false;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		return true;
	}

}
