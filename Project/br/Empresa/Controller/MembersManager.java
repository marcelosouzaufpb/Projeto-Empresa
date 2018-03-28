package br.Empresa.Controller;

import java.util.ArrayList;

import br.Empresa.DAO.MembersManagerDAO;
import br.Empresa.Models.Members;

public class MembersManager {
	private ArrayList<Members> membersList;
	private MembersManagerDAO membersDao;

	public MembersManager(ArrayList<Members> membersList, MembersManagerDAO membersDao) {
		super();
		this.membersList = membersList;
		this.membersDao = membersDao;
	}

	public String toString() {
		return "MembersManager [membersList=" + membersList + ", membersDao=" + membersDao + "]";
	}

	public ArrayList<Members> getMembersList() {
		return membersList;
	}

	public void setMembersList(ArrayList<Members> membersList) {
		this.membersList = membersList;
	}

	public MembersManagerDAO getMembersDao() {
		return membersDao;
	}

	public void setMembersDao(MembersManagerDAO membersDao) {
		this.membersDao = membersDao;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((membersDao == null) ? 0 : membersDao.hashCode());
		result = prime * result + ((membersList == null) ? 0 : membersList.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MembersManager other = (MembersManager) obj;
		if (membersDao == null) {
			if (other.membersDao != null)
				return false;
		} else if (!membersDao.equals(other.membersDao))
			return false;
		if (membersList == null) {
			if (other.membersList != null)
				return false;
		} else if (!membersList.equals(other.membersList))
			return false;
		return true;
	}

}
