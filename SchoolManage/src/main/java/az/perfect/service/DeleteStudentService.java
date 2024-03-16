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
public class DeleteStudentService implements MenuService {

    @Override
    public void prosess() {

        LinkedList<Student> students = Base.instance().getStudents();
        int deleteStudent = MenuUtil.ededAl("Nece nomreli telebenin melumatlarini silmek isteyirsiniz?") - 1;

        if (deleteStudent >= 0 && deleteStudent < students.size()) {

            int tesdiq = MenuUtil.ededAl("Silmek istediyinize eminsiniz?"
                    + """
                          
                          1.Beli
                          2.Xeyr
                          """);
            switch (tesdiq) {
                case 1:
                    students.remove(deleteStudent);
                    System.out.println("Telebe melumatlari silindi!");
                    break;
                case 2:
                    System.out.println("Silinme legv olundu!");
                    break;
                default:
                    System.out.println("Duzgun secim edin!!!");
                    break;
            }

        } else {
            throw new IllegalArgumentException("Number is invalide");
        }
        Base.save();

    }

}
