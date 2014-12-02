package ru.yandex.zhmyd.hotel.model;

@SuppressWarnings("unused")
public class User {

	private Integer id;

	//@Size(min = 3, max = 20, message = "Username must be between 3 and 20 characters long")
	private String firstName;

	//@Pattern(regexp = "[а-яА-ЯёЁa-zA-Z]*")
	//@Size(min = 3, max = 32)
	private String lastName;

	//@Pattern(regexp = "[a-zA-Z0-9]*")
	//@Size(min = 6, max = 10)
	private String login;
	
	//@Pattern(regexp="a-zA-Z0-9")
	//@Size(min =6, max=10)
	private String email;
	private String password;
	private Gender gender;
	private UserRole role;

    public Integer getId() {
		return id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", password=" + password +
                ", gender=" + gender +
                ", role=" + role +
                '}';
    }
}
