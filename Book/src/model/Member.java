package model;

import java.util.List;

import factory.LoanFactory;
import specification.HasReachMaxSpecification;
import specification.ISpecification;
import specification.LoanOnlyOneSpecification;

public class Member {
	private String id;
	private String name;
	private List<Loan> loans;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Loan> getLoans() {
		return loans;
	}
	public void setLoans(List<Loan> loans) {
		this.loans = loans;
	}
	public Member(String id, String name, List<Loan> loans) {

		this.id = id;
		this.name = name;
		this.loans = loans;
	}
	public Member(){
		super();
	}
	public void returnBook(Book book){
		Loan loan = findCurrentLoanFor(book);
		if(loan!=null){
			loan.MarkAsReturned();
			book.setLoanTo(null);
		}
	}
	public boolean canLoan(Book book){
		//借书规则
		if(book.getLoanTo()==null){
			ISpecification<Member> isMax = new HasReachMaxSpecification();
			ISpecification<Member> isOnlyOne = new LoanOnlyOneSpecification(book);
			if(isMax.isSatisfiedBy(this)){
				System.out.println("没有达到最大借书数量");
				if(isOnlyOne.isSatisfiedBy(this)){
					System.out.println("符合借书规则，借书成功");
					return true;
				}
				else{
					System.out.println("不符合借书规则，借书失败");
					return false;
				}
			}
			else{
				System.out.println("已经达到最大借书数，借书失败");
				return false;
			}
		}
		else{
			System.out.println("该书已被借走");
			return false;
		}

		
	}
	public Loan loan(Book book){
		Loan loan = null;
		if(canLoan(book)){
			loan = LoanFactory.createLoan(book, this);
			getLoans().add(loan);
		}
		return loan;
		
	}
	public Loan findCurrentLoanFor(Book book){
		for(Loan l : loans){
			if(l.getBook().equals(book)){
				return l;
			}
		}
		return null;
		
	}
}
