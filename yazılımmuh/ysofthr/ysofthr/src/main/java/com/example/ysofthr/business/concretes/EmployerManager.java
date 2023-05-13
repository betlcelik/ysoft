package com.example.ysofthr.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ysofthr.business.abstracts.EmployerService;
import com.example.ysofthr.core.results.DataResult;
import com.example.ysofthr.core.results.SuccessDataResult;
import com.example.ysofthr.dataAccess.abstracts.EmployerDao;
import com.example.ysofthr.entities.Employer;
import com.example.ysofthr.entities.dtos.EmployerWithPositionDto;

import java.util.ArrayList;

@Service
public class EmployerManager implements EmployerService{
	
	private EmployerDao employerDao;
	
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}
	

	@Override
	public DataResult<Employer> getById(int id) {
		
		
		return new SuccessDataResult<Employer>(this.employerDao.findById(id));
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll());
	}
	



	@Override
	public DataResult<Employer> add(Employer employer) {
		this.employerDao.save(employer);
		
		return new SuccessDataResult<Employer>(employer,"Employer added successfully");
	}





}
