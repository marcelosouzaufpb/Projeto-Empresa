package br.ADM_Eagle.Models;

public class Clients extends People {

	private int id;
	private String note;

	public Clients() {
		super();
		this.id = 0;
		this.note = "";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getObservacao() {
		return note;
	}

	public void setObservacao(String observacao) {
		this.note = observacao;
	}

	public String toString() {
		return "Cliente [id=" + id + ", observacao=" + note + "]";
	}

	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + id;
		result = prime * result + ((note == null) ? 0 : note.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clients other = (Clients) obj;
		if (id != other.id)
			return false;
		if (note == null) {
			if (other.note != null)
				return false;
		} else if (!note.equals(other.note))
			return false;
		return true;
	}

}
