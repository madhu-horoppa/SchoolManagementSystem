package com.kanaxis.sms.model;

// Generated Sep 6, 2015 11:22:28 AM by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Notifications generated by hbm2java
 */
@Entity
@Table(name = "notifications", catalog = "sms")
public class Notifications implements java.io.Serializable {

	private Integer id;
	private Messagetype messagetype;
	private Integer fromId;
	private String message;
	private Boolean status;
	private String fromName;
	private Integer toId;
	private String toName;
	private Integer classId;
	private Integer sectionId;
	private Date createdDate;

	public Notifications() {
	}

	public Notifications(Messagetype messagetype, Integer fromId,
			String message, Boolean status, String fromName, Integer toId,
			String toName, Integer classId, Integer sectionId, Date createdDate) {
		this.messagetype = messagetype;
		this.fromId = fromId;
		this.message = message;
		this.status = status;
		this.fromName = fromName;
		this.toId = toId;
		this.toName = toName;
		this.classId = classId;
		this.sectionId = sectionId;
		this.createdDate = createdDate;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "message_type")
	public Messagetype getMessagetype() {
		return this.messagetype;
	}

	public void setMessagetype(Messagetype messagetype) {
		this.messagetype = messagetype;
	}

	@Column(name = "from_id")
	public Integer getFromId() {
		return this.fromId;
	}

	public void setFromId(Integer fromId) {
		this.fromId = fromId;
	}

	@Column(name = "message", length = 65535)
	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Column(name = "status")
	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Column(name = "from_name", length = 45)
	public String getFromName() {
		return this.fromName;
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	@Column(name = "to_id")
	public Integer getToId() {
		return this.toId;
	}

	public void setToId(Integer toId) {
		this.toId = toId;
	}

	@Column(name = "to_name", length = 45)
	public String getToName() {
		return this.toName;
	}

	public void setToName(String toName) {
		this.toName = toName;
	}

	@Column(name = "class_id")
	public Integer getClassId() {
		return this.classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	@Column(name = "section_id")
	public Integer getSectionId() {
		return this.sectionId;
	}

	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", length = 19)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}