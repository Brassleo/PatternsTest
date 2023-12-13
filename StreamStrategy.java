public class StreamStrategy implements Strategy {
    @Override
    public Integer countCardinality(Set set) {
        return (int) set.getSet().stream().filter(bit -> bit == 1).count();
    }
}
