/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.service;

import az.perfect.bean.Student;
import az.perfect.config.Base;
import az.perfect.menu.MenuUtil;
import java.util.LinkedList;

/**
 *
 * @author Behruz Tapdiqov
 */
public class StudentShowService implements MenuService {
    
    @Override
    public void prosess() {
        
        LinkedList<Student> students = Base.instance().getStudents();
        
        int index=1;
        
        for(Student student:students){
            System.out.println(index+"."+student);
            index++;
           
            
        }
        
    }
    
}
