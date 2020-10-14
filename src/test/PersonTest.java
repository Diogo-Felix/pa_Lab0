package test;

import com.pa.Person;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void testGetName(){
        Person p1 = new Person(5, "diogo");
        assertEquals("diogo", p1.getName());
    }
}
