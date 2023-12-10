/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entites;

/**
 *
 * @author Maro
 */
public class Subject {
    private int subject_id;
    private String subject_name;
    private int[] students_ids;
    private int[] lecturers_ids;
    
    public Subject(int subject_id, String subject_name, int[] students_ids, int[] lecturers_ids){
        this.lecturers_ids = lecturers_ids;
        this.subject_name = subject_name;
        this.subject_id = subject_id;
        this.students_ids = students_ids;
    }
    
    //getters and setters
}
