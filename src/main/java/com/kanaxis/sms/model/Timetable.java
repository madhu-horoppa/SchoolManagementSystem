package com.kanaxis.sms.model;

// Generated Sep 17, 2015 6:41:17 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Timetable generated by hbm2java
 */
@Entity
@Table(name = "timetable", catalog = "sms")
public class Timetable implements java.io.Serializable {

	private Integer id;
	private Days days;
	private Section section;
	private Subject subject;
	private Teachers teachers;
	private Classes classes;
	private String startTime;
	private String endTime;

	public Timetable() {
	}

	public Timetable(Days days, Section section, Subject subject,
			Teachers teachers, Classes classes, String startTime, String endTime) {
		this.days = days;
		this.section = section;
		this.subject = subject;
		this.teachers = teachers;
		this.classes = classes;
		this.startTime = startTime;
		this.endTime = endTime;
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
	@JoinColumn(name = "day_id")
	public Days getDays() {
		return this.days;
	}

	public void setDays(Days days) {
		this.days = days;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "section_id")
	public Section getSection() {
		return this.section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subj_id")
	public Subject getSubject() {
		return this.subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "teacher_id")
	public Teachers getTeachers() {
		return this.teachers;
	}

	public void setTeachers(Teachers teachers) {
		this.teachers = teachers;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "class_id")
	public Classes getClasses() {
		return this.classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	@Column(name = "start_time", length = 45)
	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	@Column(name = "end_time", length = 45)
	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

}
