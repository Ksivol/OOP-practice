package ru.ssau.tk.Practice_SAS;

import org.testng.annotations.Test;
import ru.ssau.tk.Practice_SAS.Tasks.Person;

import static org.testng.Assert.*;

public class PersonTest {

    private final static double DELTA = 0.00001;

    @Test
    public void testMethods() {
        Person firstPerson = new Person();
        Person secondPerson = new Person();
        firstPerson.setFirstName("Jotaro");
        secondPerson.setFirstName("Dio");
        firstPerson.setLastName("Kujo");
        secondPerson.setLastName("Brando");
        firstPerson.setPassportId(91374682);
        secondPerson.setPassportId(33333333);
        assertEquals(firstPerson.getFirstName(), "Jotaro");
        assertEquals(secondPerson.getFirstName(), "Dio");
        assertEquals(firstPerson.getLastName(), "Kujo");
        assertEquals(secondPerson.getLastName(), "Brando");
        assertEquals(firstPerson.getPassportId(), 91374682, DELTA);
        assertEquals(secondPerson.getPassportId(), 33333333, DELTA);
    }
}