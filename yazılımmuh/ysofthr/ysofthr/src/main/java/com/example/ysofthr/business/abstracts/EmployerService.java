package com.example.ysofthr.business.abstracts;

import java.util.List;

import com.example.ysofthr.core.results.DataResult;
import com.example.ysofthr.entities.Employer;
import com.example.ysofthr.entities.dtos.EmployerWithPositionDto;

public interface EmployerService{
	
 public DataResult<Employer> getById(int id);
	public DataResult<List<Employer>> getAll();
	public DataResult<Employer> add(Employer employer);
	
	
	
}
