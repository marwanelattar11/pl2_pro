/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entites;

/**
 *
 * @author Maro
 */
public class Exam {
    private int ex_id;
    private int subject_id;
    private double duration;
    //private String // questions , answers
    
    public Exam(int ex_id, int subject_id, double duration /*array*/){
        this.duration = duration ;
        this.ex_id = ex_id;
        this.subject_id = subject_id;
        //hnb3t el array
    }
    
    //getters and setters
}
