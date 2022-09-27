/**
 * File: MagelightUniversity.java
 * Description: Use the object created before
 * Lessons Learned: In this lesson I learned how to use the object and creating new table.
 *     Person name1 = new Person
 *     Using the spaces to create a table
 *     System.out.printf("%s %15s %10s %15s %15s %10s %24s", "Name","|", "Age","|", "Gender","|",
 *                 "Phone Number \n");
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 09/25/2022.
 */
package week2;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class MagelightUniversity {
    public static void main(String[] args) {
        ArrayList<Person> Person = new ArrayList<Person>();

        Person name1 = new Person("Rachel","1993-05-12","F","801-555-1212" );
        Person name2 = new Person("Jose","2004-12-01","M","480-555-1212" );
        Person name3 = new Person("Prya","2001-02-27","F","385-555-1212" );
        Person name4 = new Person("Bob","1984-06-06","M","916-555-1212" );

        Person.add(name1);
        Person.add(name2);
        Person.add(name3);
        Person.add(name4);

        System.out.printf("%s %15s %10s %15s %15s %10s %24s", "Name","|", "Age","|", "Gender","|",
                "Phone Number \n");
        System.out.printf("%s","----------------------------------------------------------------------------------------------------------------\n");
        for (Person  p : Person){
            Period timeDifference = Period.between(p.getDob(), LocalDate.now());
            int birthday = timeDifference.getYears();
            System.out.printf("%-19s%-9s%-18s%-12s%-15s%-12s%s\n", p.getName(),"|", birthday,"|",
                    p.getGender(),"|", p.getPhone());
        }
    }
}
