package com.prasad.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "STUDENT11")
public class StudentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int stuid;
	private String firstName;
	private String lastName;
	private String department;
	@OneToOne(cascade = CascadeType.ALL)
	private AddressEntity address;

	public int getStuid() {
		return stuid;
	}

	public void setStuid(int stuid) {
		this.stuid = stuid;
	}

	@Override
	public String toString() {
		return "StudentEntity [stuid=" + stuid + ", firstName=" + firstName + ", lastName=" + lastName + ", department="
				+ department + ", address=" + address + "]";
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

	public StudentEntity() {
		super();

	}

	public StudentEntity(String firstName, String lastName, String department, AddressEntity address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.address = address;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public AddressEntity getAddress() {
		return address;
	}

	public void setAddress(AddressEntity address) {
		this.address = address;
	}

}
