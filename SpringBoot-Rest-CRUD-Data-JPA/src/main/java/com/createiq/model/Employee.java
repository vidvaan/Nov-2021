package com.createiq.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Setter
@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@XmlRootElement
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eid;
	@NotEmpty
	@Size(min= 4, message = "Min length should be 4")
	private String ename;
	@NotEmpty(message = "Lname should not be empty")
	@Size(min= 4, message = "Min length should be 4")
	private String lname;
	@NotEmpty(message = "Email should not be empty")
	@Email
	private String email;
	@NotNull
	private Double esal;

	

}
