package br.ADM_Eagle.Models;

public class Payment {
	private int id;
	private double value;
	private Date payday;
	private String operationalCode;
	private double trafficTicket;
	private String note;
	private String formOfPayment;
	private Date dueDate;
	private String status;

	public Payment(int id, double value, Date payday, String operationalCode, double trafficTicket, String note,
			String formOfPayment, Date dueDate, String status) {
		super();
		this.id = id;
		this.value = value;
		this.payday = payday;
		this.operationalCode = operationalCode;
		this.trafficTicket = trafficTicket;
		this.note = note;
		this.formOfPayment = formOfPayment;
		this.dueDate = dueDate;
		this.status = status;
	}

	public String toString() {
		return "Payment [id=" + id + ", value=" + value + ", payday=" + payday + ", operationalCode=" + operationalCode
				+ ", trafficTicket=" + trafficTicket + ", note=" + note + ", formOfPayment=" + formOfPayment
				+ ", dueDate=" + dueDate + ", status=" + status + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Date getPayday() {
		return payday;
	}

	public void setPayday(Date payday) {
		this.payday = payday;
	}

	public String getOperationalCode() {
		return operationalCode;
	}

	public void setOperationalCode(String operationalCode) {
		this.operationalCode = operationalCode;
	}

	public double getTrafficTicket() {
		return trafficTicket;
	}

	public void setTrafficTicket(double trafficTicket) {
		this.trafficTicket = trafficTicket;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getFormOfPayment() {
		return formOfPayment;
	}

	public void setFormOfPayment(String formOfPayment) {
		this.formOfPayment = formOfPayment;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dueDate == null) ? 0 : dueDate.hashCode());
		result = prime * result + ((formOfPayment == null) ? 0 : formOfPayment.hashCode());
		result = prime * result + id;
		result = prime * result + ((note == null) ? 0 : note.hashCode());
		result = prime * result + ((operationalCode == null) ? 0 : operationalCode.hashCode());
		result = prime * result + ((payday == null) ? 0 : payday.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		long temp;
		temp = Double.doubleToLongBits(trafficTicket);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(value);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		if (dueDate == null) {
			if (other.dueDate != null)
				return false;
		} else if (!dueDate.equals(other.dueDate))
			return false;
		if (formOfPayment == null) {
			if (other.formOfPayment != null)
				return false;
		} else if (!formOfPayment.equals(other.formOfPayment))
			return false;
		if (id != other.id)
			return false;
		if (note == null) {
			if (other.note != null)
				return false;
		} else if (!note.equals(other.note))
			return false;
		if (operationalCode == null) {
			if (other.operationalCode != null)
				return false;
		} else if (!operationalCode.equals(other.operationalCode))
			return false;
		if (payday == null) {
			if (other.payday != null)
				return false;
		} else if (!payday.equals(other.payday))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (Double.doubleToLongBits(trafficTicket) != Double.doubleToLongBits(other.trafficTicket))
			return false;
		if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value))
			return false;
		return true;
	}

}