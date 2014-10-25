package ru.yandex.zhmyd.hotelmodel.domain;

public class User {

	private long id;
	private String firstName;
	private String lastName;
	private String login;
	private String email;
	private int passwordHashCode;
	private Gender gender = Gender.UNCNOWN;
	private UserRole role = UserRole.CUSTOMER;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public int getPasswordHashCode() {
		return passwordHashCode;
	}

	public void setPasswordHashCode(int passwordHashCode) {
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
