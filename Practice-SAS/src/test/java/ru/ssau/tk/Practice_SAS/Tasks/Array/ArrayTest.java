package ru.ssau.tk.Practice_SAS.Tasks.Array;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ArrayTest {

    @Test
    public void testArrayLength() {
        Array check = new Array();
        int[] newArray = check.arrayLength(13);
        assertEquals(newArray.length, 13);
        int[] othArray = check.arrayLength(11);
        assertEquals(othArray.length, 11);
        assertNotEquals(othArray.length, 17);
    }

    @Test
    public void testGenerateArray2() {
        Array check = new Array();
        int[] newArray = check.generateArray2(4);
        assertEquals(newArray[0], 2);
        assertEquals(newArray[1], 1);
        assertEquals(newArray[2], 1);
        assertEquals(newArray[3], 2);
    }

    @Test
    public void testArrayOddNumbers() {
        Array check = new Array();
        int[] newArray = check.arrayOddNumbers(7);
        assertEquals(newArray[0], 1);
        assertEquals(newArray[1], 3);
        assertEquals(newArray[2], 5);
        assertEquals(newArray[3], 7);
        assertEquals(newArray[4], 9);
        assertEquals(newArray[5], 11);
        assertEquals(newArray[6], 13);

    }

}