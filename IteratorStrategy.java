public class IteratorStrategy implements Strategy {

    @Override
    public Integer countCardinality(Set set) {
        int count=0;
        Iterator it=new Iterator(set);
        while(it.hasNext()){
            int cur = it.next();
            if (cur == 1) count++;
        }
        return count;
    }
}
