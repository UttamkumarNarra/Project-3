package com.app.Institutions.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "user_data", uniqueConstraints = { @UniqueConstraint(columnNames = "username") })
public class User {

	private long UserId;
	private String Firstname;
	private String Lastname;
	private String Email;
	private long Mobile;
	private String Username;
	private String Password;
	private String ConfirmPassword;

	public User() {
	}

	public User(long userId, String firstname, String lastname, String email, long mobile, String username,
			String password, String confirmPassword) {
		super();
		UserId = userId;
		Firstname = firstname;
		Lastname = lastname;
		Email = email;
		Mobile = mobile;
		Username = username;
		Password = password;
		ConfirmPassword = confirmPassword;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getUserId() {
		return UserId;
	}

	public void setUserId(long userId) {
		UserId = userId;
	}

	@Column
	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	@Column
	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	@Column
	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Column
	public long getMobile() {
		return Mobile;
	}

	public void setMobile(long mobile) {
		Mobile = mobile;
	}

	@Column(unique = true)
	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	@Column
	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getConfirmPassword() {
		return ConfirmPassword;
	}

	@Column
	public void setConfirmPassword(String confirmPassword) {
		ConfirmPassword = confirmPassword;
	}

	@Override
	public String toString() {
		return "User [UserId=" + UserId + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", Email=" + Email
				+ ", Mobile=" + Mobile + ", Username=" + Username + ", Password=" + Password + ", ConfirmPassword="
				+ ConfirmPassword + "]";
	}

}
