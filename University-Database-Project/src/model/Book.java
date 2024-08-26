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
@Table(name = "BOOK")
public class Book {
	
	@Basic(optional = false)
	@Column(name = "bName", length = 255)
	private String bName;
	
	@Basic(optional = false)
	@Column(name = "author", length = 255)
	private String author;
	
	@Id
	@Column(name = "bookId")
	private int bookId;
	
	@Basic(optional = false)
	@Column(name = "pickupLibrary", length = 255)
	private String pickupLibrary;
	
	@Basic(optional = false)
	@Column(name = "pickupShelf", length = 255)
	private String pickupShelf;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "dName")
	private Department department;
	
	@OneToMany(mappedBy = "book")
	private Collection<Checkout> checkouts;

	public Book() {
	
	}
	
	public Book(String bName, String author, int bookId, String pickupLibrary, String pickupShelf, Department department)
	{
		this.bName = bName;
		this.author = author;
		this.bookId = bookId;
		this.pickupLibrary = pickupLibrary;
		this.pickupShelf = pickupShelf;
		this.department = department;
	}
	
	public String getBName() {
		return bName;
	}

	public String getAuthor() {
		return author;
	}

	public Department getDepartment() {
		return department;
	}
	
	public int getBookId() {
		return bookId;
	}
	
	public String getPickupLibrary() {
		return pickupLibrary;
	}
	
	public String getPickupShelf() {
		return pickupShelf;
	}
	
	public Collection<Checkout> getCheckouts() {
		return checkouts;
	}	
}
