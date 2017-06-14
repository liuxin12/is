package model;

import java.time.LocalDateTime;

public class Loan {
	private String id;
	private LocalDateTime loanDate;
	private LocalDateTime lateForReturn;
	private LocalDateTime returnDate;
	private Book book;
	private Member member;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}

	public LocalDateTime getLoanDate() {
		return loanDate;
	}
	public void setLoanDate(LocalDateTime loanDate) {
		this.loanDate = loanDate;
	}
	public LocalDateTime getLateForReturn() {
		return lateForReturn;
	}
	public void setLateForReturn(LocalDateTime lateForReturn) {
		this.lateForReturn = lateForReturn;
	}
	public LocalDateTime getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(LocalDateTime returnDate) {
		this.returnDate = returnDate;
	}
	public Loan(){
		super();
	}
	public Loan(String id, LocalDateTime loanDate, LocalDateTime lateForReturn, LocalDateTime returnDate, Book book,
			Member member) {
		this.id = id;
		this.loanDate = loanDate;
		this.lateForReturn = lateForReturn;
		this.returnDate = returnDate;
		this.book = book;
		this.member = member;
	}
	public boolean HasNotBeenReturn(){
		return returnDate==null;
		
	}
	public void MarkAsReturned(){
		returnDate = LocalDateTime.now();
	}
}
