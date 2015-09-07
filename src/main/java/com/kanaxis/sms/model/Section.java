package com.kanaxis.sms.model;

// Generated Sep 6, 2015 11:22:28 AM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Section generated by hbm2java
 */
@Entity
@Table(name = "section", catalog = "sms")
public class Section implements java.io.Serializable {

	private Integer id;
	private Classes classes;
	private String sectionName;
	private Set<Timetable> timetables = new HashSet<Timetable>(0);
	private Set<Student> students = new HashSet<Student>(0);
	private Set<TransactionReport> transactionReports = new HashSet<TransactionReport>(
			0);
	private Set<ClassSubjectTeacherMapping> classSubjectTeacherMappings = new HashSet<ClassSubjectTeacherMapping>(
			0);

	public Section() {
	}

	public Section(Classes classes, String sectionName,
			Set<Timetable> timetables, Set<Student> students,
			Set<TransactionReport> transactionReports,
			Set<ClassSubjectTeacherMapping> classSubjectTeacherMappings) {
		this.classes = classes;
		this.sectionName = sectionName;
		this.timetables = timetables;
		this.students = students;
		this.transactionReports = transactionReports;
		this.classSubjectTeacherMappings = classSubjectTeacherMappings;
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
	@JoinColumn(name = "class_id")
	public Classes getClasses() {
		return this.classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	@Column(name = "section_name", length = 45)
	public String getSectionName() {
		return this.sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "section")
	public Set<Timetable> getTimetables() {
		return this.timetables;
	}

	public void setTimetables(Set<Timetable> timetables) {
		this.timetables = timetables;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "section")
	public Set<Student> getStudents() {
		return this.students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "section")
	public Set<TransactionReport> getTransactionReports() {
		return this.transactionReports;
	}

	public void setTransactionReports(Set<TransactionReport> transactionReports) {
		this.transactionReports = transactionReports;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "section")
	public Set<ClassSubjectTeacherMapping> getClassSubjectTeacherMappings() {
		return this.classSubjectTeacherMappings;
	}

	public void setClassSubjectTeacherMappings(
			Set<ClassSubjectTeacherMapping> classSubjectTeacherMappings) {
		this.classSubjectTeacherMappings = classSubjectTeacherMappings;
	}

}