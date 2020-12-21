package ru.ssau.tk.Practice_SAS.Tasks.Generator;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ResettableIntGeneratorTest {
    @Test
    public void testNextInt() {
        ResettableIntGenerator generator = new ResettableIntGenerator();
        assertEquals(generator.nextInt(), 0);
        assertEquals(generator.nextInt(), 1);
    }

    @Test
    public void testReset() {
        ResettableIntGenerator generator = new ResettableIntGenerator();
        int count = generator
                .nextInt();
        generator.nextInt();
        generator.reset();
        assertEquals(generator.nextInt(), 0);
    }
}