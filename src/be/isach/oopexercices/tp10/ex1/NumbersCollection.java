package be.isach.oopexercices.tp10.ex1;

import java.util.ArrayList;

public class NumbersCollection<N extends Number> {

    private final ArrayList<N> numbers;

    public NumbersCollection() {
        this.numbers = new ArrayList<>();
    }

    public void add(N number) {
        this.numbers.add(number);
    }

    public double arithmeticMean() {
        double mean = 0.0;
        for (N number : numbers) {
            mean += number.doubleValue();
        }
        if (numbers.size() > 0)
            mean /= numbers.size();
        return mean;
    }

    public double geometricMean() {
        double mean = 1.0;
        for (N number : numbers) {
            mean *= number.doubleValue();
        }
        if (numbers.size() > 0)
            mean = Math.pow(mean, 1 / (double) numbers.size());
        return mean;
    }

    public double harmonicMean() {
        double mean = 0.0;
        for (N number : numbers) {
            mean += 1 / number.doubleValue();
        }
        if (mean != 0)
            mean = numbers.size() / mean;
        return mean;
    }
}
