/* Sy Alejandrino
 * Date: April 2023
 * Course: CSC 480 (Database & File Systems) @ DePauw University
 */

package model;

import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {
	@Id
	@Column(name = "sId")
	private int sId;
	
	@Basic(optional = false)
	@Column(name = "sName", length = 255)
	private String sName;
	
	@ManyToOne(optional = true)
	@JoinColumn(name = "dName")
	private Department major;
	
	@OneToMany(mappedBy = "student")
	private Collection<Checkout> checkouts;

	public Student(String sName, int sId, Department major)
	{
		this.sId = sId;
		this.sName = sName;
		this.major = major;
	}
	public Student() {
		
	}
	
	public int getSId() {
		return sId;
	}

	public String getSName() {
		return sName;
	}

	public Department getMajor() {
		return major;
	}
	
	public void setMajor(Department major) {
		this.major = major;
	}
	
	public Collection<Checkout> getCheckouts() {
		return checkouts;
	}	
}
