/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package_Users;

import Entites.*;

/**
 *
 * @author Maro
 */
//import java.io.*;
public class Admin extends Person{
    public Admin(Person person){
        super(person.getID(), person.getEmail(), person.getPassWord(), person.getUserName(), person.getType());
    }
    public void register(){
        
    }
    
    public void delete(){
        
    }
    
    public void update(){
        
    }
    
//    public String list(){
//        
//    }
//    
//    public String search(){
//        
//    }
//}
//    
//    
//    public void add_user(int ID, String userName, String passWord, String email, int type){
//        
//        File file = new File("D://JAVA//PL2_Project//Users.txt");
//        try
//        {
//            if(file.createNewFile())
//                System.out.println("success");
//        }catch(IOException ex)
//        {
//            System.out.println("Exception : " + ex.getMessage());
//        }
//        
//        try{
//            FileWriter fw = new FileWriter(file,true);
//            fw.append("------------------------------------------------\n");
//            fw.append (ID + ", ");
//            fw.append(userName + ", ");
//            fw.append(email + ", ");
//            fw.append(passWord + ", ");
//            fw.append(type + "\n");
//            fw.close();
//        }catch(IOException ex)
//        {
//            System.out.println("Exception : " + ex.getMessage());
//        }
//         System.out.println("User Added Success");
//    }
}
