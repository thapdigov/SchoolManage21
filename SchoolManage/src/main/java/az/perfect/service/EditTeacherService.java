/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.service;

import az.perfect.bean.Student;
import az.perfect.bean.Teacher;
import az.perfect.config.Base;
import az.perfect.menu.MenuUtil;
import java.util.LinkedList;

/**
 *
 * @author Behruz Tapdiqov
 */
public class EditTeacherService implements MenuService {

    @Override
    public void prosess() {

        LinkedList<Teacher> teachers = Base.instance().getTeachers();
        int editTeacher = MenuUtil.ededAl("Nece nomreli muellimin melumatlarini deyismek isteyirsiniz?") - 1;
        Teacher s = teachers.get(editTeacher);
        boolean studentfound = false;

        if (editTeacher >= 0 && editTeacher < teachers.size()) {

            studentfound = true;

            int data = MenuUtil.ededAl("Deyismek istediyinizi qeyd edin"
                    + """
                          
                          1.name
                          2.surname
                          3.age
                          4.schoolname
                          5.salary
                          
                          """);
            switch (data) {
                case 1:
                    s.setName(MenuUtil.textAl("Yeni adi daxil edin"));
                    break;
                case 2:
                    s.setSurname(MenuUtil.textAl("Yeni soyadi daxil edin"));
                    break;
                case 3:
                    s.setAge(MenuUtil.ededAl("Yeni yasi daxil edin"));
                    break;
                case 4:
                    s.setSchoolName(MenuUtil.textAl("Yeni school adi daxil edin"));
                    break;
                case 5:
                    s.setSalary(MenuUtil.ededAl("Yeni salary daxil edin"));
                    break;
                default:
                    System.out.println("Duzgun secum edin:");
            }
        } else {
            throw new IllegalArgumentException("Number is invalide");
        }
        
        Base.save();
    }
}
