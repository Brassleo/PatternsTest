public class CardinalityVisitor implements Visitor {
private int cardinality = 0;

    public int getCardinality() {
        return cardinality;
    }

    @Override
    public void visit(Integer i) {
        if(i==1)cardinality++;
    }
}
