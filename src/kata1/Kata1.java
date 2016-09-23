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
public class Kata1 {

    /**
     * @param args the  command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Person person = new Person("Daniel" , "Suárez",  new Date(-96,6,3));
        System.out.println(person.getName() + " " + person.getSurname() + " tiene " + person.getAge() + " años ");
        
    }
}
