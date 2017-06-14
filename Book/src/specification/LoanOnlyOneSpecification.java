package specification;

import java.util.List;

import model.Book;
import model.Loan;
import model.Member;

public class LoanOnlyOneSpecification implements ISpecification<Member> {
	
	private Book wantBook;	
	
	public LoanOnlyOneSpecification(Book wantBook) {
		this.wantBook = wantBook;
	}


	@Override
	public boolean isSatisfiedBy(Member member) {
		// TODO Auto-generated method stub
		List<Loan> loans = member.getLoans();
		for(Loan l : loans){
			if(l.getBook().getISBN().equals(wantBook.getISBN())){
				return false;
			}
		}
		return true;
	} 

}
