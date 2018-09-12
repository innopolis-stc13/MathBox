package hw3;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;


public class MathBox<T extends Number> extends ObjectBox {


    public MathBox(T[] mas) {
        super(new TreeSet<>());
        for (int i = 0; i < mas.length; i++) {
            collection.add(mas[i]);
        }
    }

    public double summator() {
        return collection.stream()
                .map(a -> ((Number) a).doubleValue())
                .reduce((a, b) -> a + b)
                .orElse(0d);
    }

    public Set<Double> splitter(double divider) throws Exception {
        if (divider == 0) {
            throw new Exception("Divide by zero!");
        }
        return collection.stream()
                .map(a -> ((Number) a).doubleValue() / divider)
                .collect(Collectors.toSet());
    }

    @Override
    public boolean addObject(Object o) {
        if (!(o instanceof Number)) {
            throw new Exception("Wrong type!");
        } else {
            return super.addObject(o);
        }
    }
}
