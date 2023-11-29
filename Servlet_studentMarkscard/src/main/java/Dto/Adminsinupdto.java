package Dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Adminsinupdto {
	@Id
	private int vtuid;
	private String username;
	private String designation;
	private String password;

	public int getVtuid() {
		return vtuid;
	}

	public void setVtuid(int vtuid) {
		this.vtuid = vtuid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Adminsinupdto [vtuid=" + vtuid + ", username=" + username + ", designation=" + designation
				+ ", password=" + password + "]";
	}

	

}
