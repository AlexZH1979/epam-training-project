package ru.yandex.zhmyd.hotel.model;

public interface IReadUser {
	public int getId();

	public String getFirstName();;

	public String getLastName();;

	public String getEmail();

	public void setEmail(String email);
	
	public int getPasswordHashCode();
}
