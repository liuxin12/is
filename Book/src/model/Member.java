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
		//�������
		if(book.getLoanTo()==null){
			ISpecification<Member> isMax = new HasReachMaxSpecification();
			ISpecification<Member> isOnlyOne = new LoanOnlyOneSpecification(book);
			if(isMax.isSatisfiedBy(this)){
				System.out.println("û�дﵽ����������");
				if(isOnlyOne.isSatisfiedBy(this)){
					System.out.println("���Ͻ�����򣬽���ɹ�");
					return true;
				}
				else{
					System.out.println("�����Ͻ�����򣬽���ʧ��");
					return false;
				}
			}
			else{
				System.out.println("�Ѿ��ﵽ��������������ʧ��");
				return false;
			}
		}
		else{
			System.out.println("�����ѱ�����");
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
