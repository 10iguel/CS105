/**
 * File: Person.java
 * Description: Creating a new Object
 * Lessons Learned: In this lesson I learned how to create an Object and constructors .
 *     Setters
 *     Getters
 *     Constructors
 *     Person(String name, String dob, String gender, String phone) {
 *                 this.name = name;
 *                 this.dob = LocalDate.parse(dob);
 *                 this.gender = gender;
 *                 this.phone = phone;
 *         }
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 09/21/2022.
 */

package week2;

import java.time.LocalDate;


// Classes will model the concepts
public class Person {
        private String name;
        private LocalDate dob;
        private String gender;
        private String phone;

        public Person(){
                this.name =  "";
                this.dob =  LocalDate.of(1900,01,01) ;
                this.gender = "";
                this.phone =  "";
        }

        public Person(String name, String dob, String gender, String phone) {
                this.name = name;
                this.dob = LocalDate.parse(dob);
                this.gender = gender;
                this.phone = phone;
        }

        // Getter

        public String getName() {
                return name;
        }

        public LocalDate getDob() {
                return dob;
        }

        public String getGender() {
                return gender;
        }

        public String getPhone() {
                return phone;
        }

        // Setter


        public void setName(String name) {
                this.name = name;
        }

        public void setDob(String dob) {
                this.dob = LocalDate.parse(dob);
        }

        public void setGender(String gender) {
                this.gender = gender;
        }

        public void setPhone(String phone) {
                this.phone = phone;
        }
}
