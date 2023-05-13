package com.example.ysofthr.api;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ysofthr.business.abstracts.EmployerService;
import com.example.ysofthr.core.results.DataResult;
import com.example.ysofthr.entities.Employer;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/employers")
public class EmployerController {
	
	EmployerService employerService;
	
	@Autowired
	public EmployerController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}

	

	@GetMapping("/getById")
	public DataResult<Employer> getById(@RequestParam int id){
		return this.employerService.getById(id);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Employer>> getAll(){


 
		return this.employerService.getAll();
	}
	
	@PostMapping("/add")
	public DataResult<Employer> add(@RequestBody Employer employer){
		
		return this.employerService.add(employer);
	}

}
