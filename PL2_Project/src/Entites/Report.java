/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entites;

/**
 *
 * @author Maro
 */
public class Report {
    private int report_id;
    private int student_id;
    private int lecturer_id;
    private String info;
    
    public Report(int report_id, int student_id, int lecturer_id, String info){
        this.info = info;
        this.lecturer_id = lecturer_id;
        this.report_id = report_id;
        this.student_id = student_id;
    }
    
    //getters and setters
}
