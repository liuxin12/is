package test;

import java.util.ArrayList;
import java.util.List;

import model.Book;
import model.Loan;
import model.Member;

public class ReturnTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ʼ������
		Member member = new Member();
		member.setId("1");
		member.setName("xiaoming");
		Loan loan = new Loan();
		Book book1 = new Book("1", "xiaoming", "ɢ��", member);
		loan.setBook(book1);
		loan.setId("1");		
		loan.setMember(member);
		List<Loan> loans = new ArrayList<>();
		loans.add(loan);
		member.setLoans(loans);
		//����
		member.returnBook(book1);
	}

}
