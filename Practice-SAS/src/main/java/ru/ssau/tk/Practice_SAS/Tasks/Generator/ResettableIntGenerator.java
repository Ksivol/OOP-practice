package ru.ssau.tk.Practice_SAS.Tasks.Generator;

public class ResettableIntGenerator extends IntGeneratorImpl implements Resettable, IntGenerator {
    @Override
    public int nextInt() {
        return super.nextInt();
    }

    @Override
    public void reset() {
        super.counter = 0;
    }
}
