package specification;

public interface ISpecification<T> {
	public boolean isSatisfiedBy(T t);
}
