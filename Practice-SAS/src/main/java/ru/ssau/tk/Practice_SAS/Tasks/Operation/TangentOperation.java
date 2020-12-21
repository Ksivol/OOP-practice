package ru.ssau.tk.Practice_SAS.Tasks.Operation;

public class TangentOperation extends Operation {
    @Override
    public double apply(double number) { //радианы
        if (Double.isNaN(number)) {
            throw new ArithmeticException("It's NaN.");
        }
        if (Double.isInfinite(number)) {
            throw new ArithmeticException("Can't calculate the tangent of the value: it's infinite.");
        }
        return Math.tan(number);
    }
}
