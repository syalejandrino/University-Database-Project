/* Sy Alejandrino
 * Date: April 2023
 * Course: CSC 480 (Database & File Systems) @ DePauw University
 */

package model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CHECKOUT")
public class Checkout {

	@ManyToOne(optional = false)
	@JoinColumn(name = "bookId")
	private Book book;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "sId")
	private Student student;
	
	public Checkout() {
		
	}
	public Checkout(Book book, Student student) {
		this.book = book;
		this.student = student;
	}
	
	public Book getBook() {
		return book;
	}
	
	public Student getStudent() {
		return student;
	}
	
}