package com.users.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "UserDetails")
public class UserDetails {

	@Id
	private Integer id;
	private String firstName;
	private String lastName;

}
