package main;

import calculator.Calculator;
import figures.*;

public class Main {
    public static void main(String[] args) {
        Calculator[] calculators = {
                new Calculator(new CircleBitmapImpl(10)),
                new Calculator(new CircleVectorImpl(10)),
                new Calculator(new SquareBitmapImpl(4)),
                new Calculator(new SquareVectorImpl(4)),
                new Calculator(new TriangleBitmapImpl(2,5,4)),
                new Calculator(new TriangleVectorImpl(2,5,4))
        };
        for( Calculator c : calculators){
            System.out.println(c.calculateSurface());
        }
    }
}
