package Services;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Maro
 */
import java.io.*;
import java.util.*;
import Entites.Person;
public class Person_Services{
    private File file = new File("Users.txt");
    private ArrayList<Person> person_array = new ArrayList<>();
    
    public Person_Services(){
        load_users();
    };
    
    public void load_users(){
        try(Scanner fr = new Scanner(file))
        {
        while(fr.hasNextLine()){
            String[] data = fr.nextLine().split(", ");
            int id = Integer.parseInt(data[0]);
            String email = data[1];
            String password = data[2];
            String username = data[3];
            int role = Integer.parseInt(data[4]);
            Person person = new Person(id,email,password,username,role);
            person_array.add(person);
                                }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
         
    }
    public ArrayList<Person> find(){
        return new ArrayList<>(person_array);
    }
    
//    public void save_data(){
        
    
            
}
