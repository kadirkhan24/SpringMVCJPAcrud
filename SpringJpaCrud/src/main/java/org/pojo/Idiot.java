package org.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;


@Entity
@Table(name="idiot_JPA")
@DynamicUpdate
public class Idiot 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name="mobile")
	private long mobile;
	@Column(name="country")
	private String country;
	
	public Idiot() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Idiot [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", country=" + country
				+ "]";
	}
	
}
