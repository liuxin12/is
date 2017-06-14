package model;

public class Book {
	private String id;
	private String ISBN;
	private String title;
	private Member loanTo;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Member getLoanTo() {
		return loanTo;
	}
	public void setLoanTo(Member loanTo) {
		this.loanTo = loanTo;
	}
	public Book(String id, String iSBN, String title, Member loanTo) {
		this.id = id;
		ISBN = iSBN;
		this.title = title;
		this.loanTo = loanTo;
	}
	public Book(){
		super();
	}
}
