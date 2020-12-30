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

}