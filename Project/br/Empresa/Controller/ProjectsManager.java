package br.Empresa.Controller;

import java.util.ArrayList;

import br.Empresa.DAO.ProjectsManagerDAO;
import br.Empresa.Models.Projects;

public class ProjectsManager {
	private ArrayList<Projects> projectsList;
	private ProjectsManagerDAO projectsDao;

	public ProjectsManager(ArrayList<Projects> projectsList, ProjectsManagerDAO projectsDao) {
		super();
		this.projectsList = projectsList;
		this.projectsDao = projectsDao;
	}

	public String toString() {
		return "ProjectsManager [projectsList=" + projectsList + ", projectsDao=" + projectsDao + "]";
	}

	public ArrayList<Projects> getProjectsList() {
		return projectsList;
	}

	public void setProjectsList(ArrayList<Projects> projectsList) {
		this.projectsList = projectsList;
	}

	public ProjectsManagerDAO getProjectsDao() {
		return projectsDao;
	}

	public void setProjectsDao(ProjectsManagerDAO projectsDao) {
		this.projectsDao = projectsDao;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((projectsDao == null) ? 0 : projectsDao.hashCode());
		result = prime * result + ((projectsList == null) ? 0 : projectsList.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProjectsManager other = (ProjectsManager) obj;
		if (projectsDao == null) {
			if (other.projectsDao != null)
				return false;
		} else if (!projectsDao.equals(other.projectsDao))
			return false;
		if (projectsList == null) {
			if (other.projectsList != null)
				return false;
		} else if (!projectsList.equals(other.projectsList))
			return false;
		return true;
	}

}
