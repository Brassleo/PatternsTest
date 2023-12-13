import java.util.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Set {
    private ArrayList<Integer> array;
    private int min;
    Strategy strategy=new IteratorStrategy();

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public ArrayList<Integer> getSet() {
        return array;
    }
    public Set(){
        array =new ArrayList<>();
        min = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i =0; i<array.size()-1;i++){
            if(array.get(i)==1){
            int num = i + min;
            sb.append(num);
            sb.append(',');
            }
        }
        if(array.get(array.size()-1)==1){
            sb.append(array.size()-1+min);
        }
        sb.append(']');
        return sb.toString();
    }
    public void add(int num) {
        if (num < min) {
            int zerosToAdd = min - num;
            for (int i = 0; i < zerosToAdd; i++) {
                array.add(0, 0);
            }
            min = num;
        }

        int index = num - min;
        while (array.size() <= index) {
            array.add(0);
        }
        array.set(index, 1);
    }

    public void save(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int bit : array) {
                writer.write(String.valueOf(bit));
                writer.write(" ");
            }
            writer.newLine();

            for (int i = 0; i < array.size(); i++) {
                if (array.get(i) == 1) {
                    writer.write(String.valueOf(min + i));
                    writer.write(" ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Integer cardinality(){
        return strategy.countCardinality(this);
    }

    public void accept(Visitor visitor){
            for (Integer t : array)
                visitor.visit(t);
    }
}
