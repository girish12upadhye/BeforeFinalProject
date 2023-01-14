package com.infy.ledegerdefaulter.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Ledeger 
{
 
	@Id
	private Integer ledegerId;
	private String ledegerDate;
	private Double principalAmount;
	private Double EMIamount;
	private Integer remEmi;
	private String emiStatus;
}
