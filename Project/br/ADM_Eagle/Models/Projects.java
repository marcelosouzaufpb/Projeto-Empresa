package br.ADM_Eagle.Models;

public class Projects {
	private int id;
	private String name;
	private String teamInvolved;
	private String projectSector;
	private Date startDate;
	private Date endDate;
	private int duration;
	private Date dueDate;
	private String note;
	private String status;
	private Payment payment;

	public Projects(int id, String name, String teamInvolved, String projectSector, Date startDate, Date endDate,
			int duration, Date dueDate, String note, String status, Payment payment) {
		super();
		this.id = id;
		this.name = name;
		this.teamInvolved = teamInvolved;
		this.projectSector = projectSector;
		this.startDate = startDate;
		this.endDate = endDate;
		this.duration = duration;
		this.dueDate = dueDate;
		this.note = note;
		this.status = status;
		this.payment = payment;
	}

	public String toString() {
		return "Projects [id=" + id + ", name=" + name + ", teamInvolved=" + teamInvolved + ", projectSector="
				+ projectSector + ", startDate=" + startDate + ", endDate=" + endDate + ", duration=" + duration
				+ ", dueDate=" + dueDate + ", note=" + note + ", status=" + status + ", payment=" + payment + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeamInvolved() {
		return teamInvolved;
	}

	public void setTeamInvolved(String teamInvolved) {
		this.teamInvolved = teamInvolved;
	}

	public String getProjectSector() {
		return projectSector;
	}

	public void setProjectSector(String projectSector) {
		this.projectSector = projectSector;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dueDate == null) ? 0 : dueDate.hashCode());
		result = prime * result + duration;
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((note == null) ? 0 : note.hashCode());
		result = prime * result + ((payment == null) ? 0 : payment.hashCode());
		result = prime * result + ((projectSector == null) ? 0 : projectSector.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((teamInvolved == null) ? 0 : teamInvolved.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Projects other = (Projects) obj;
		if (dueDate == null) {
			if (other.dueDate != null)
				return false;
		} else if (!dueDate.equals(other.dueDate))
			return false;
		if (duration != other.duration)
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (note == null) {
			if (other.note != null)
				return false;
		} else if (!note.equals(other.note))
			return false;
		if (payment == null) {
			if (other.payment != null)
				return false;
		} else if (!payment.equals(other.payment))
			return false;
		if (projectSector == null) {
			if (other.projectSector != null)
				return false;
		} else if (!projectSector.equals(other.projectSector))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (teamInvolved == null) {
			if (other.teamInvolved != null)
				return false;
		} else if (!teamInvolved.equals(other.teamInvolved))
			return false;
		return true;
	}

}
