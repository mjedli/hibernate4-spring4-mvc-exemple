/**
 * 
 */
package com.parismon.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author mjedli
 *
 */
@Entity
@Table(name="USER")
public class ParismonUser implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotEmpty
	@NotNull
	@Column(name = "EMAIL", unique=true, nullable = false)
	private String email;
	
	@NotEmpty
	@NotNull
	@Column(name = "PASSWORD", nullable = false)
	private String password;
	
	@NotEmpty
	@NotNull
	@Size(min=3, max=50)
	@Column(name = "FIRST_NAME", nullable = false)
	private String firstname;
	
	@NotEmpty
	@NotNull
	@Size(min=3, max=50)
	@Column(name = "LAST_NAME", nullable = false)
	private String lastname;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
}
