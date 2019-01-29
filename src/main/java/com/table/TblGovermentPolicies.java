package com.table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_goverment_policies")
public class TblGovermentPolicies {

	@Id
	@GeneratedValue
	@Column(name = "policy_id")
	private Long policyid;
	
	@Column(name="description")
	private String description;
	
	@Column(name="created_date")
	private String createddate;
	
	@Column(name="created_by")
	private String createdby;
	
	@Column(name="status")
	private String status;
	
	@Column(name="title")
	private String title;


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getPolicyid() {
		return policyid;
	}

	public void setPolicyid(Long policyid) {
		this.policyid = policyid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreateddate() {
		return createddate;
	}

	public void setCreateddate(String createddate) {
		this.createddate = createddate;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
