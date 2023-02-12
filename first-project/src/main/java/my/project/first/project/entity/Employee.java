package my.project.first.project.entity;

import jakarta.persistence.Entity;

@Entity
public class Employee {


	private Long id;
	private String Name;
	private String role;
	private String email;
	private Long phonenumber;
	
	
	
	public Employee(String name, String role, String email, long phonenumber) {
		super();
		Name = name;
		this.role = role;
		this.email = email;
		this.phonenumber = phonenumber;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Employee(String name, String role, String email) {
		super();
		Name = name;
		this.role = role;
		this.email = email;
	}
	public Long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	
}
