package com.prasad.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "STUDENT_ADDRESS")
public class AddressEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int hno;
	private String street;
	private String town;

	public AddressEntity() {
		super();
	}

	@Override
	public String toString() {
		return "AddressEntity [hno=" + hno + ", street=" + street + ", town=" + town + "]";
	}

	public int getHno() {
		return hno;
	}

	public AddressEntity(int hno, String street, String town) {
		super();
		this.hno = hno;
		this.street = street;
		this.town = town;
	}

	public void setHno(int hno) {
		this.hno = hno;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

}
