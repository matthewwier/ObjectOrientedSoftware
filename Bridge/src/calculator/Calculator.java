package calculator;

import figures.Figure;

public class Calculator implements AbstractCalculator {

    private Figure figure;

    public Calculator(Figure figure) {
        this.figure = figure;
    }

    @Override
    public double calculateSurface() {
        return figure.calculate();
    }
}
