/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package_Users;

/**
 *
 * @author Maro
 */
import java.util.*;
import java.io.*;
import Entites.*;
import Services.Person_Services;

public class User extends Person{
    private Person_Services person_services = new Person_Services();
    private ArrayList<Person> person_array = person_services.find();
   
    public User(Person person){
        super(person.getID(), person.getEmail(), person.getPassWord(), person.getUserName(), person.getType());
    }
    public void update_username()
    {
        
    }
    
    public void update_password(){
        
    }
    
    public void update_email(){
        
    }
    
    public void show_user(){
        for(Person person : person_array){
            System.out.println(person.getID());
        }
    }
    
//    File file = new File("D://JAVA//");
//    try
//    {
//        if(file.createNewFile())
//            System.out.println("success");
//        else
//            System.out.println("failed");
//    }catch(IOEXCEPTION ex)
//    {
//        System.out.println("Exception : " + ex.getMessage());
//    }
    
//    public boolean register(String email , String passWord , String userName, int type){
//        
//    }
    
   
    

}
