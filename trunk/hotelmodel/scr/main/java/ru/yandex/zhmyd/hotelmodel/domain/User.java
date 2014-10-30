package ru.yandex.zhmyd.hotelmodel.domain;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {

	private Long id;

	@Pattern(regexp = "[а-яА-ЯёЁa-zA-Z]*")
	@Size(min = 3, max = 32)
	private String firstName;

	@Pattern(regexp = "[а-яА-ЯёЁa-zA-Z]*")
	@Size(min = 3, max = 32)
	private String lastName;

	@Pattern(regexp = "[a-zA-Z0-9]*")
	@Size(min = 6, max = 10)
	private String login;
	
	@Pattern(regexp="a-zA-Z0-9")
	@Size(min =6, max=10)
	private String email;
	private Integer passwordHashCode;
	private Gender gender;
	private UserRole role;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPasswordHashCode() {
		return passwordHashCode;
	}

	public void setPasswordHashCode(Integer passwordHashCode) {
		this.passwordHashCode = passwordHashCode;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}

}
