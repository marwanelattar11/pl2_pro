/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entites;

/**
 *
 * @author Maro
 */
public class Person {
    private String userName;
    private String passWord;
    private String email;
    private int type; // 1 for admin . 2 for student . 3 for lecturer
    private int ID;
    
    public Person(int ID ,String email,String passWord,String userName,int type){
        this.ID = ID;
        this.email = email;
        this.passWord = passWord;
        this.userName = userName;
        this.type = type;
    }
    public void setUserName(String userName){
        this.userName = userName ;
    }
    
    public void setPassWord(String passWord){
        this.passWord = passWord;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setType(int type){
        this.type = type;
    }
    
    public int getID(){
        return this.ID;
    }
    
    public String getUserName(){
        return this.userName;
    }
    
    public String getPassWord(){
        return this.passWord;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public int getType(){
       return this.type;
    }
    
    
}
