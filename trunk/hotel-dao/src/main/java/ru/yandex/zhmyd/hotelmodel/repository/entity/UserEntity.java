package ru.yandex.zhmyd.hotelmodel.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.dozer.Mapping;

@Entity
@Table(name = "user")
public class UserEntity {

	@Id
	@Mapping("id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private Long id;

	@Mapping("firstName")
	@Column(name = "USER_FIRST_NAME")
	private String firstName;

	@Mapping("lastName")
	@Column(name = "USER_LAST_NAME")
	private String lastName;

	@Mapping("login")
	@Column(name = "USER_LOGIN")
	private String login;

	@Mapping("email")
	@Column(name = "USER_EMAIL")
	private String email;

	@Mapping("passwordHashCode")
	@Column(name = "USER_PASSWORD_HASH")
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
