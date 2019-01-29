package com.table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_comment")

public class TblComment {
	
	@Id
	@GeneratedValue
	@Column(name = "comment_id")
	private Long comment_id;
	
	@Column(name = "problem_id")
	private Long problem_id;
	
	@Column(name = "created_date")
	private String createddate;
	
	@Column(name = "comment")
	private String comment;

	@Column(name = "status")
	private int status;
	
	@Column(name = "user_id")
	private Long userid;

	public Long getComment_id() {
		return comment_id;
	}

	public void setComment_id(Long comment_id) {
		this.comment_id = comment_id;
	}

	public Long getProblem_id() {
		return problem_id;
	}

	public void setProblem_id(Long problem_id) {
		this.problem_id = problem_id;
	}

	public String getCreateddate() {
		return createddate;
	}

	public void setCreateddate(String createddate) {
		this.createddate = createddate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
}
