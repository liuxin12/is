package factory;

import java.time.LocalDateTime;
import model.Book;
import model.Loan;
import model.Member;

public class LoanFactory {
	public static Loan createLoan(Book book,Member member){
		Loan loan = new Loan();
		loan.setBook(book);
		loan.setMember(member);
		loan.setLoanDate(LocalDateTime.now());
		loan.setLateForReturn(LocalDateTime.now().plusDays(10));
		return loan;
		
	}
}
