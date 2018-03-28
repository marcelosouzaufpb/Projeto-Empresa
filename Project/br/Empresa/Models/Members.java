package br.Empresa.Models;

public class Members extends People {
	private int id;
	private String office;
	private String course;
	private String currentPeriod;
	private String reference;
	private Date entryDate;
	private String note;

	public Members(int id, String office, String course, String currentPeriod, String reference, Date entryDate,
			String note) {
		super();
		this.id = id;
		this.office = office;
		this.course = course;
		this.currentPeriod = currentPeriod;
		this.reference = reference;
		this.entryDate = entryDate;
		this.note = note;
	}

	public String toString() {
		return "Members [id=" + id + ", office=" + office + ", course=" + course + ", currentPeriod=" + currentPeriod
				+ ", reference=" + reference + ", entryDate=" + entryDate + ", note=" + note + "]";
	}

	public int getId() {

		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCurrentPeriod() {
		return currentPeriod;
	}

	public void setCurrentPeriod(String currentPeriod) {
		this.currentPeriod = currentPeriod;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((course == null) ? 0 : course.hashCode());
		result = prime * result + ((currentPeriod == null) ? 0 : currentPeriod.hashCode());
		result = prime * result + ((entryDate == null) ? 0 : entryDate.hashCode());
		result = prime * result + id;
		result = prime * result + ((note == null) ? 0 : note.hashCode());
		result = prime * result + ((office == null) ? 0 : office.hashCode());
		result = prime * result + ((reference == null) ? 0 : reference.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Members other = (Members) obj;
		if (course == null) {
			if (other.course != null)
				return false;
		} else if (!course.equals(other.course))
			return false;
		if (currentPeriod == null) {
			if (other.currentPeriod != null)
				return false;
		} else if (!currentPeriod.equals(other.currentPeriod))
			return false;
		if (entryDate == null) {
			if (other.entryDate != null)
				return false;
		} else if (!entryDate.equals(other.entryDate))
			return false;
		if (id != other.id)
			return false;
		if (note == null) {
			if (other.note != null)
				return false;
		} else if (!note.equals(other.note))
			return false;
		if (office == null) {
			if (other.office != null)
				return false;
		} else if (!office.equals(other.office))
			return false;
		if (reference == null) {
			if (other.reference != null)
				return false;
		} else if (!reference.equals(other.reference))
			return false;
		return true;
	}

}