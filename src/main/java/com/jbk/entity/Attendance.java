package com.jbk.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "attendance")
public class Attendance {
	@Id
	private String id;

	private String date;
	private String time;
	private int counts;

	@ManyToOne
	@JoinColumn(name = "username")
	private User user;

	@ManyToOne
	@JoinColumn(name = "")
	private Subject subject;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "attendance_student", joinColumns = @JoinColumn(name = "aid"), inverseJoinColumns = @JoinColumn(name = "student_id"))
	private List<Student> students;

	public void setId(String id2) {
		// TODO Auto-generated method stub
		
	}

	public void setDate(Object date2) {
		// TODO Auto-generated method stub
		
	}

	public void setCounts(int size) {
		// TODO Auto-generated method stub
		
	}

	public void setSubject(Subject subjectById) {
		// TODO Auto-generated method stub
		
	}

	public void setUser(User userByUsername) {
		// TODO Auto-generated method stub
		
	}

	public void setStudents(List<Student> allStudentByRoll) {
		// TODO Auto-generated method stub
		
	}

	public void setTime(Object time2) {
		// TODO Auto-generated method stub
		
	}

	

}
