package com.cubic.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "Salaries")
public class SalaryEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int salary_id;

	@Column(name = "salary")
	private long salary;
	
	@Column(name = "position")
	private String position;
	
	@Column(name = "started_at")
	private String started_at;

	@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinTable(name="employee_salary",joinColumns=@JoinColumn(name="sal_id"),inverseJoinColumns=@JoinColumn(name="empl_id"))
	
	private List <EmployeeEntity>employee;

	public int getSalary_id() {
		return salary_id;
	}

	public void setSalary_id(int salary_id) {
		this.salary_id = salary_id;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getStarted_at() {
		return started_at;
	}

	public void setStarted_at(String started_at) {
		this.started_at = started_at;
	}

	public List<EmployeeEntity> getEmployee() {
		return employee;
	}

	public void setEmployee(List<EmployeeEntity> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "SalaryEntity [salary_id=" + salary_id + ", salary=" + salary + ", position=" + position
				+ ", started_at=" + started_at + ", employee=" + employee + "]";
	}
	
	
}
