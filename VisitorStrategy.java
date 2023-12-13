public class VisitorStrategy implements Strategy{
    @Override
    public Integer countCardinality(Set set) {
        CardinalityVisitor visitor=new CardinalityVisitor();
        set.accept(visitor);
        return visitor.getCardinality();
    }
}
