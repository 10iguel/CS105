package DessertShop;

import week2.Person;

import java.util.*;


public class Test {
    public static void main(String[] args) {
        Map<String, Person> staff = new HashMap<>();
        staff.put("144-25-5464", new Person("Rachel","1993-05-12","F","801-555-1212" ));
        staff.put("567-24-2546", new Person("Rachel","1993-05-12","F","801-555-1212" ));
        staff.put("157-62-7935", new Person("Rachel","1993-05-12","F","801-555-1212" ));
        staff.put("456-62-5527", new Person("Rachel","1993-05-12","F","801-555-1212" ));

        // print all entries

        System.out.println(staff);

        // remove an entry

        staff.remove("567-24-2546");

        // replace an entry

        staff.put("456-62-5527", new Person("Rachel","1993-05-12","F","801-555-1212" ));

        // look up a value

        System.out.println(staff.get("157-62-7935"));

        // iterate through all entries

        staff.forEach((k, v) ->{

                System.out.println("key=" + k + ", value=" + v);
                    System.out.println("hey");
        }
                );

    }
}

