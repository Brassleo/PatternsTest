import java.util.List;

public class Iterator implements IteratorInterface {
int current=0;
List<Integer> lst;
Iterator(Set set){
    lst= set.getSet();
}
    @Override
    public boolean hasNext() {
        return lst.size()-current>0;
    }

    @Override
    public Integer next() {
        current++;
        return lst.get(lst.size()-current);
    }
}
