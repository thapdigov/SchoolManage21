/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.service;

import az.perfect.bean.Student;
import az.perfect.bean.Teacher;
import az.perfect.config.Base;
import java.util.LinkedList;

/**
 *
 * @author Behruz Tapdiqov
 */
public class TeacherShowService implements MenuService {

    @Override
    public void prosess() {

        LinkedList<Teacher> teachers = Base.instance().getTeachers();

        int index = 1;
        for (Teacher teacher : teachers) {
            System.out.println(index + "." + teacher);
            index++;
        }

    }

}
