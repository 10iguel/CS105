/**
 * File: PersonTest.java
 * Description: Creating new Testing files
 * Lessons Learned: In this lesson I learned how to test my code in java.
 *     Juint
 *     assertEquals
 *     assert()
 *     @Test of a getter
 *     public void getGender() {
 *         Person person = new Person("Max","2010-01-10","male","123456789" );
 *         assertEquals(  "male", person.getGender(),"there is an error" );
 *     }
 *     @Test of a setter
 *     public void setName () {
 *         Person p = new Person();
 *         p.setName("Miguel Fernandez");
 *         assertEquals("Miguel Fernandez", p.getName(), "Set name failed");
 *     }
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 09/23/2022.
 */

package week2;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    public void getName() {
        var res = new Person("Max","2010-01-10","male","123456789" );
        assertEquals(  "Max", res.getName(),"there is an error" );
    }

    @Test
    public void getDob() {
        Person person = new Person("Max","2010-01-10","male","123456789");
        LocalDate res = LocalDate.of(2010,01,10);
        assert(res.equals(person.getDob()));
    }

    @Test
    public void getGender() {
        Person person = new Person("Max","2010-01-10","male","123456789" );
        assertEquals(  "male", person.getGender(),"there is an error" );
    }

    @Test
    public void getPhone() {
        var res = new Person("Max","2010-01-10","male","123456789" );
        assertEquals(  "123456789", res.getPhone(),"there is an error" );
    }

    @Test
    public void setName () {
        Person p = new Person();
        p.setName("Miguel Fernandez");
        assertEquals("Miguel Fernandez", p.getName(), "Set name failed");
    }

    @Test
    public void setDob() {
        Person p = new Person();
        p.setDob("2010-01-10");
        LocalDate res = LocalDate.of(2010,01,10);
        assert(res.equals(p.getDob()));
    }

    @Test
    public void setGender() {
        Person p = new Person();
        p.setGender("M");
        assertEquals("M",p.getGender(),"there is an error" );
    }

    @Test
    public void setPhone() {
        Person p = new Person();
        p.setPhone("213456");
        assertEquals("213456",p.getPhone(),"there is an error" );
    }
}