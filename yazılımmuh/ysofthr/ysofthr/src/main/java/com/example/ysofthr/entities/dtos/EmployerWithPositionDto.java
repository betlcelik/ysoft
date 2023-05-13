package com.example.ysofthr.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployerWithPositionDto {
	
	private int id;
	private String firstName;
	private String lastName;
	private String positionName;
	

}
