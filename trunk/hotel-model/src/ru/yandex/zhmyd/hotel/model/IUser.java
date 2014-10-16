package ru.yandex.zhmyd.hotel.model;

public interface IUser extends IReadUser {

	public void setId(int id);

	public void setFirstName(String firstName);

	public void setLastName(String lastName);

	public void setEmail(String email);

	public void setPasswordHashCode(int passwordHashCode);
}
