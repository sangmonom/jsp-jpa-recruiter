package com.recruitment.team.model.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;
import static javax.persistence.FetchType.EAGER;

/**
 * Entity implementation class for Entity: Company
 *
 */
@Entity

public class Company implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String phone1;
	private String phone2;
	private String email;
	private String website;
	@OneToMany(mappedBy = "company")
	List<Township> township;
	private String ownerName;
	private String address;
	@OneToMany(mappedBy = "company")
	List<Recruiter> entryBy;
	private LocalDate entry_date;
	@OneToMany(mappedBy = "company")
	List<Recruiter> modifyBy;
	
	private LocalDate modifyDate;
	private String remark;
	
	public List<Township> getTownship() {
		return township;
	}

	public void setTownship(List<Township> township) {
		this.township = township;
	}

	public void setEntryBy(List<Recruiter> entryBy) {
		this.entryBy = entryBy;
	}

	public void setModifyBy(List<Recruiter> modifyBy) {
		this.modifyBy = modifyBy;
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

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Recruiter> getEntryBy() {
		return entryBy;
	}

	public List<Recruiter> getModifyBy() {
		return modifyBy;
	}

	public LocalDate getEntry_date() {
		return entry_date;
	}

	public void setEntry_date(LocalDate entry_date) {
		this.entry_date = entry_date;
	}
	public LocalDate getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(LocalDate modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Company() {
		super();
	}
   
}
