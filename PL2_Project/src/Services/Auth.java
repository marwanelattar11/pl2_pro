/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

/**
 *
 * @author Maro
 */
import java.io.*;
import java.util.*;
import Package_Users.User;
public class Auth{
    public static User login(String email, String passWord)
    {
        File file = new File("D:\\JAVA\\PL2_Project\\Users.txt");
        try{
            Scanner fr = new Scanner(file);
            while(fr.hasNextLine()){
                
                String[] info = fr.nextLine().split(","); // 1 , ahmed , 
                int id = Integer.parseInt(info[0]);
                String UserName = info[3];
                String Auth_email = info[1];
                String Auth_password = info[2];
                int role = Integer.parseInt(info[4]);               
                if (Auth_email.equals(email) && Auth_password.equals(passWord)){
                    System.out.println("success");
             //       return new User(id,email,passWord,UserName,role);
                }
            }
            System.out.println("Wrong Email or Password");
            }catch(IOException ex){
                    System.out.println("Exception 1 " + ex.getMessage());
            }
            return null;   
    }
    
    public static void logout(){
     //   login();
    }
}
