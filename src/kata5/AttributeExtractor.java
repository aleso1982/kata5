package kata5;

public interface AttributeExtractor<E, A> {
    
    public A extract(E entity);
    
}
