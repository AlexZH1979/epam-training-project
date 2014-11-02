package ru.yandex.zhmyd.hotelmodel.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.dozer.Mapping;

import ru.yandex.zhmyd.hotelmodel.repository.enumerated.Gender;
import ru.yandex.zhmyd.hotelmodel.repository.enumerated.UserRole;

@Entity
@Table(name = "user")
public class UserEntity {

	@Id
	@Mapping("id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable=false, unique=true)
	private Long id;

	@Mapping("firstName")
	@Column(name = "first_name", nullable=false, unique=false)
	private String firstName;

	@Mapping("lastName")
	@Column(name = "last_name", nullable=false, unique=false)
	private String lastName;

	@Mapping("login")
	@Column(name = "user_login", nullable = false, unique = true)
	private String login;

	@Mapping("email")
	@Column(name = "user_email", nullable = false, unique = true)
	private String email;

	@Mapping("passwordHashCode")
	@Column(name = "password_hash_code", nullable = false, unique = false)
	private Integer passwordHashCode;

	@Mapping("gender")
	@Column(name = "gender_id", nullable = false, unique = false)
	@Enumerated(EnumType.ORDINAL)
	private Gender gender;

	@Mapping("role")
	@Column(name = "role_id", nullable = false, unique = false)
	@Enumerated(EnumType.ORDINAL)
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
