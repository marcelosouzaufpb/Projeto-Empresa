package br.ADM_Eagle.Controller;

public class System {
	private ClientsManager clientsManager;
	private LoginManager loginManager;
	private MembersManager membersManager;
	private PaymentManager paymentManager;
	private ProjectsManager projectsManager;
	

	public System(ClientsManager clientsManager, MembersManager membersManager, PaymentManager paymentManager,
			ProjectsManager projectsManager, LoginManager loginManager) {
		super();
		this.clientsManager = clientsManager;
		this.membersManager = membersManager;
		this.paymentManager = paymentManager;
		this.projectsManager = projectsManager;
		this.loginManager = loginManager;
	}

	public String toString() {
		return "System [clientsManager=" + clientsManager + ", membersManager=" + membersManager + ", paymentManager="
				+ paymentManager + ", projectsManager=" + projectsManager + ", loginManager=" + loginManager + "]";
	}

	public ClientsManager getClientsManager() {
		return clientsManager;
	}

	public void setClientsManager(ClientsManager clientsManager) {
		this.clientsManager = clientsManager;
	}

	public MembersManager getMembersManager() {
		return membersManager;
	}

	public void setMembersManager(MembersManager membersManager) {
		this.membersManager = membersManager;
	}

	public PaymentManager getPaymentManager() {
		return paymentManager;
	}

	public void setPaymentManager(PaymentManager paymentManager) {
		this.paymentManager = paymentManager;
	}

	public ProjectsManager getProjectsManager() {
		return projectsManager;
	}

	public void setProjectsManager(ProjectsManager projectsManager) {
		this.projectsManager = projectsManager;
	}

	public LoginManager getLoginManager() {
		return loginManager;
	}

	public void setLoginManager(LoginManager loginManager) {
		this.loginManager = loginManager;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clientsManager == null) ? 0 : clientsManager.hashCode());
		result = prime * result + ((loginManager == null) ? 0 : loginManager.hashCode());
		result = prime * result + ((membersManager == null) ? 0 : membersManager.hashCode());
		result = prime * result + ((paymentManager == null) ? 0 : paymentManager.hashCode());
		result = prime * result + ((projectsManager == null) ? 0 : projectsManager.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		System other = (System) obj;
		if (clientsManager == null) {
			if (other.clientsManager != null)
				return false;
		} else if (!clientsManager.equals(other.clientsManager))
			return false;
		if (loginManager == null) {
			if (other.loginManager != null)
				return false;
		} else if (!loginManager.equals(other.loginManager))
			return false;
		if (membersManager == null) {
			if (other.membersManager != null)
				return false;
		} else if (!membersManager.equals(other.membersManager))
			return false;
		if (paymentManager == null) {
			if (other.paymentManager != null)
				return false;
		} else if (!paymentManager.equals(other.paymentManager))
			return false;
		if (projectsManager == null) {
			if (other.projectsManager != null)
				return false;
		} else if (!projectsManager.equals(other.projectsManager))
			return false;
		return true;
	}

}
