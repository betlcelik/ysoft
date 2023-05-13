package com.example.ysofthr.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.ysofthr.entities.Employer;
import com.example.ysofthr.entities.dtos.EmployerWithPositionDto;

public interface EmployerDao extends JpaRepository<Employer, Integer> {
	
	public Employer findById(int id);
	
	//@Query("select new com.example.ysofthr.entities.dtos.EmployerWithPositionsDto(e.id,e.firstName,e.lastName,p.positionName) from Position p Inner Join p.employers e ")
	 //public List<EmployerWithPositionDto> getEmployersWithPositions();

}
