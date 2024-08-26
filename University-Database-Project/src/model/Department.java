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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DEPARTMENT")
public class Department {

	@Id
	@Column(name = "dName", length = 255)
	private String dName;
	
	@Basic(optional = false)
	@Column(name = "chairName", length = 255)
	private String chairName;
	
	@Basic(optional = false)
	@Column(name = "location", length = 255)
	private String location;
	
	
	@OneToMany(mappedBy = "major")
	private Collection<Student> students;
	
	@OneToMany(mappedBy = "department")
	private Collection<Book> books;
	
	public Department(String dName, String chairName, String location) {
		this.dName = dName;
		this.chairName = chairName;
		this.location = location;
	}
	public Department() {
		
	}
	
	public String getDName() {
		return dName;
	}
	
	public String getChairName() {
		return chairName;
	}
	
	public String getLocation() {
		return location;
	}
	
	public Collection<Student> getStudents() {
		return students;
	}
	
	public Collection<Book> getBooks() {
		return books;
	}
	
}
