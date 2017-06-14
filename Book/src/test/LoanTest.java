package test;

import java.util.ArrayList;
import java.util.List;

import model.Book;
import model.Loan;
import model.Member;

public class LoanTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//初始化数据
		Member member = new Member();
		member.setId("1");
		member.setName("xiaoming");
		Loan loan = new Loan();
		Book book1 = new Book("1", "xiaoming", "散文", member);
		Book book2 = new Book("2", "xiaoming", "小说", null);
		loan.setBook(book1);
		loan.setId("1");		
		loan.setMember(member);
		List<Loan> loans = new ArrayList<>();
		loans.add(loan);
		member.setLoans(loans);
		//借书
		System.out.println(member.canLoan(book2));

	}
}
