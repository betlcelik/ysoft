package com.example.ysofthr.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="projects")
@NoArgsConstructor
@AllArgsConstructor
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="project_name")
	private String projectName;
	
	@Column(name="min_employer")
	private int minEmployer;
	
	@Column(name="max_employer")
	private int maxEmployer;
	
	//şuanda kaç kişinin çalıştığı bilgisi 
	@Column(name="current_employer")
	private int currentEmployer;
	
	/*
	@OneToMany(mappedBy = "project")
	private List<Employer> employers;*/

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getMinEmployer() {
		return minEmployer;
	}

	public void setMinEmployer(int minEmployer) {
		this.minEmployer = minEmployer;
	}

	public int getMaxEmployer() {
		return maxEmployer;
	}

	public void setMaxEmployer(int maxEmployer) {
		this.maxEmployer = maxEmployer;
	}
	

}
