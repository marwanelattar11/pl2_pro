/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package_Users;

/**
 *
 * @author Maro
 */
import Entites.*;
public class Students extends Person {
    public Students(Person person){
        super(person.getID(), person.getEmail(), person.getPassWord(), person.getUserName(), person.getType());
    }
}
