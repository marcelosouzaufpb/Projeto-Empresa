package br.Empresa.Controller;

import br.Empresa.DAO.LoginManagerDao;
import br.Empresa.Models.Login;

public class LoginManager {
	private Login login;
	private LoginManagerDao loginDao;

	public LoginManager(Login login, LoginManagerDao loginDao) {
		super();
		this.login = login;
		this.loginDao = loginDao;
	}

	public String toString() {
		return "LoginManager [login=" + login + ", loginDao=" + loginDao + "]";
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public LoginManagerDao getLoginDao() {
		return loginDao;
	}

	public void setLoginDao(LoginManagerDao loginDao) {
		this.loginDao = loginDao;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((loginDao == null) ? 0 : loginDao.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoginManager other = (LoginManager) obj;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (loginDao == null) {
			if (other.loginDao != null)
				return false;
		} else if (!loginDao.equals(other.loginDao))
			return false;
		return true;
	}

}
