package ru.ssau.tk.Practice_SAS.Tasks.Operation;

public class SqrtOperation extends Operation {
    @Override
    public double apply(double number) {
        if (Double.isNaN(number)) {
            throw new ArithmeticException("It's NaN");
        }
        if (number < 0) {
            throw new ArithmeticException("The value must be positive");
        }
        return Math.sqrt(number);
    }
}
