import java.util.ArrayList;

public class Model {
    int k=0;
    private Set set =new Set();

    public void setStrategy(Strategy strategy) {
        set.setStrategy(strategy);
    }
    public Strategy getStrategy() {
        return set.getStrategy();
    }

    public ArrayList<Integer> getSet() {
        return set.getSet();
    }
    public void Save(String filename) {
        set.save(filename);
    }

    @Override
    public String toString() {
        return set.toString();
    }

    public void add(Integer num) {
        set.add(num);
    }

    public Integer cardinality() {
        return set.cardinality();
    }


    public void changeStrategy(){
        if(k==0) this.setStrategy(new StreamStrategy());
        else if(k==1) this.setStrategy(new IteratorStrategy());
        else this.setStrategy(new VisitorStrategy());
        k++;
        k %= 3;
    }
}
