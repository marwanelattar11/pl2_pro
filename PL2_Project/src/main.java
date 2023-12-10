/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Maro
 */
import Services.Auth;
import Package_Users.User;
import java.util.*;
import Entites.Person;
public class main{
    public static void main(String[] args) {
        Person person = new Person(1,"@naif","jj","ji",1);
        User user = new User(person);
        user.show_user();
        System.out.print("ff");
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter Email : ");
//        String email = input.nextLine();
//        System.out.print("Enter Password : ");
//        String password = input.nextLine();
//        User user = Auth.login(email,password);
//    
    }
}
