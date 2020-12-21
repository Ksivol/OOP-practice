package ru.ssau.tk.Practice_SAS.Tasks.Generator;

public class IntGeneratorImpl implements IntGenerator {
    protected int counter = 0;

    @Override
    public int nextInt() {
        counter += 1;
        return counter - 1;
    }
}
