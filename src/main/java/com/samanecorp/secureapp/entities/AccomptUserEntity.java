package com.samanecorp.secureapp.entities;

public class AccomptUserEntity {
	private Long id;
	private String email;
	private String password;
	private boolean state;
	
	public AccomptUserEntity() {
		super();
	}
	public AccomptUserEntity(Long id, String email, String password, boolean state) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.state = state;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	} 
	
	

}
