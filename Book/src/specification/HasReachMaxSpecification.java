package specification;

import model.Member;

public class HasReachMaxSpecification implements ISpecification<Member> {

	@Override
	public boolean isSatisfiedBy(Member member) {
		// TODO Auto-generated method stub
		if(member.getLoans().size()==3){
			return false;
		}
		else{
			return true;
		}
		
	}

}
