package com.sjp.Model;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long  Id;
	@Column(name="first_Name")
	private String first_Name;
	
	@Column(name="last_Name")
	private String last_Name;
	
	@Column(name="email_Id")
	private String email_Id;
	
	
	public Student() {
		
	}
	public Student(long id, String first_Name, String last_Name, String email_Id) {
		super();
		Id = id;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.email_Id = email_Id;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public String getEmail_Id() {
		return email_Id;
	}
	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}
	

}
