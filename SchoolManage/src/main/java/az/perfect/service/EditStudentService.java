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
public class EditStudentService implements MenuService {

    @Override
    public void prosess() {

        LinkedList<Student> students = Base.instance().getStudents();
        int editStudent = MenuUtil.ededAl("Nece nomreli telebenin melumatlarini deyismek isteyirsiniz?") - 1;
        Student s = students.get(editStudent);
        boolean studentfound = false;
        if (editStudent >= 0 && editStudent < students.size()) {

            studentfound = true;

            int data = MenuUtil.ededAl("Deyismek istediyinizi qeyd edin"
                    + """
                          
                          1.name
                          2.surname
                          3.age
                          4.schoolname
                          5.scolarship
                          
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
                    s.setScolarship(MenuUtil.ededAl("Yeni scolarshipi daxil edin"));
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
