/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Person {
    
    private final String name;
    private final String surname;
    private final Date birthdate;

    public Person(String name, String surname, Date birthdate) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }
    
    public String getSurname() {
        return surname;
    }

    public Date getBirthdate() {
        return birthdate;
    }
    
    public int getAge () {
        return (int) ((new Date().getTime() - birthdate.getTime())/31536000000L);
    }
    
}
