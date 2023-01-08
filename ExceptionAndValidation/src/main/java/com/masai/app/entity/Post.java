package com.masai.app.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
	@Size(max = 100,message = "{message.invalid}")
	private String message;
	@Past(message = "{creationDate.invalid}")
	private Date creationDate;
	private Date updationDate;
	@AssertTrue(message = "{isVisible.invalid}")
	private Boolean isVisible;
	@Id
	@Size(min = 8,message = "{username.invalid}")
	private String username;
	@Email(message = "{email.invalid}")
	private String user_email;
}
